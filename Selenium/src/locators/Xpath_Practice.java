package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Practice {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ojeshpaulkar@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ujjawalchoudhary");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(5000);
		driver.quit();
			
		
	}

}
