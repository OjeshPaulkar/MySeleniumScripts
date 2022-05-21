package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

public class test3 {
	
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static WebDriver driver;
	@BeforeMethod
	public void openApp() {
		
		
	}

}
