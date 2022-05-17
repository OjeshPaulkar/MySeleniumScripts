package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_2 {
	
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.instagram.com/accounts/login/?hl=en");
			driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("ojeshpaulkar@gmail.com");
			driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("abc");
			driver.findElement(By.xpath("")).click();              //NOT WORKING
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
		}

}
