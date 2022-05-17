package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWait {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  //ImplicitWait Statement
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("qwweeedd");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("kdbksksfsahfls");
		driver.findElement(By.xpath("//div[@class='             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm                                                                                                              ']")).click();
		
	}

}
