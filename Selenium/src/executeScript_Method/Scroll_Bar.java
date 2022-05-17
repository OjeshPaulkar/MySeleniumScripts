package executeScript_Method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Bar {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		JavascriptExecutor j = (JavascriptExecutor) driver;   //Type Casting
		
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,3000)");     //Scroll Down
		
		Thread.sleep(3000);
		j.executeScript("window.scrollBy(0,-1000)");   //Scroll Up
	}

}
