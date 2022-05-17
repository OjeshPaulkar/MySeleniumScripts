package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification_isEnabled {
	

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement UserName = driver.findElement(By.id("username"));
		
		if (UserName.isDisplayed()) {
			System.out.println("Test for UN is Pass");
			UserName.sendKeys("admin");
		}
		
		WebElement Pass = driver.findElement(By.name("pwd"));
		
		if (Pass.isDisplayed()) {
			System.out.println("Test For PassWord Is PASS");
			Pass.sendKeys("manager");
		}
		
		WebElement CheckBox = driver.findElement(By.name("remember"));
		
		if (CheckBox.isSelected()) {
			System.out.println("Test for checkbox is PASS");
		}
		else {
			System.out.println("CheckBox not Selected");
		}
		
		WebElement LoginButton = driver.findElement(By.id("loginButton"));
		
		if (LoginButton.isEnabled())
		{  System.out.println("Test for Submit Button is Pass");
		LoginButton.click();
		}
		
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.close();
		
		}

}
