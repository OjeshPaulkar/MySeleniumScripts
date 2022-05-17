package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver,6);         //*******************
		
		WebElement UN = driver.findElement(By.id("email"));
		wait.until(ExpectedConditions.visibilityOf(UN)).sendKeys("admin");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password"))).sendKeys("admin");
		
		//driver.findElement(By.name("password")).sendKeys("admin");
		
		
		WebElement cl = driver.findElement(By.id("last"));
		wait.until(ExpectedConditions.elementToBeClickable(cl)).click();
		
	}

}
