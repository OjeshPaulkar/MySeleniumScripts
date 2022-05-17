package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class facebook_login {
	
	static {
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		driver.findElement(By.id("email")).sendKeys("ojeshpaulkar@gmail.com");
		Thread.sleep(4000);
		driver.findElement(By.name("pass")).sendKeys("ujjawalchoudhary");
		Thread.sleep(4000);
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		driver.close();
		
	}
}
