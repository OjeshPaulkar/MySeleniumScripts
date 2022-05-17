package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().window().maximize();
		WebElement E1 = driver.findElement(By.partialLinkText("COURSE"));
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(E1).perform();
		driver.findElement(By.partialLinkText("Selenium Training")).click();
	}

}
