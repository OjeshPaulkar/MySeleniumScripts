package Testng_Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test2 {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;          //***********************************************************
	
	@BeforeSuite
	public void connectDB() {
		Reporter.log("--connecting to Data Base", true);
	}
	
	
	@BeforeMethod (groups="Regression")
	public void launchBrowser() {
		driver= new ChromeDriver();          //***************************************************************
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

	}
	
	@Test (groups="Regression")
	public void skillraryLogin() throws InterruptedException {
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		//Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("User");
		driver.findElement(By.id("password")).sendKeys("User");
		driver.findElement(By.id("last")).click();
	}
	
	@Test(groups="Regression")
	public void facebook() {
		driver.get("https://www.facebook.com/");
	}
	
	
	@AfterMethod (groups="Regression")
	public void exit() {
		System.out.println("The Tittle is-- "+driver.getTitle());
		System.out.println("the URL is-- "+driver.getCurrentUrl());
		driver.close();
	}
	
	@AfterSuite
	public void disConnectDB() {
		Reporter.log("--Disconnecting to Data Base", true);
	}


}
