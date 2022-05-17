package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verification_isDisplayed {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement UserName = driver.findElement(By.id("email"));
		
		if(UserName.isDisplayed())  {
			System.out.println("Test Is PASS");
			UserName.sendKeys("kjdkfbaskf");
		}
		else {
			System.out.println("Test is Fail");
		}
		driver.close();
		}

}
