package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_name_locators {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("admin");  //for typing action we used sendKey()
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin");   ////for typing action we used sendKey()
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();           //For clicking on login button we use click() 
		Thread.sleep(3000);
		driver.close();
		
	}
}
