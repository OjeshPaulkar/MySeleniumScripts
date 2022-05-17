package locators;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class partial_linktext_locator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Forgot password?")).click(); 
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("adcdefg");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("adgkgkgkhkhkhefg");
		Thread.sleep(3000);
		
		//*******************X-Path By Contains*******************************************
		driver.findElement(By.xpath("//div[contains(@class,'             qF0y9          Igw0E     IwRSH      eGOV_       acqo5   _4EzTm                                                                                                              ')]")).click();
		Thread.sleep(3000);

		driver.close();
	}
}
