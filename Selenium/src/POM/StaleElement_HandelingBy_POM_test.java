package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElement_HandelingBy_POM_test {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		StaleElement_HandelingBy_POM_page obj = new StaleElement_HandelingBy_POM_page(driver);
		driver.navigate().refresh();
		obj.search("Selenium");
}
}