package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_1 {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ojeshpaulkar@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.close();
	}
 
}
 