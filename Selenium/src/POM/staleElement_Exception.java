package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staleElement_Exception {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		                                                            // Getting StaleElementRefrenceException
		WebElement serachBox = driver.findElement(By.name("q"));
		driver.navigate().refresh();
		serachBox.sendKeys("Selenium");
	}

}
