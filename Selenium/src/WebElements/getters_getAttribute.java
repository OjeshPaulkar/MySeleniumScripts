package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getters_getAttribute {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement E1 = driver.findElement(By.id("email"));
		String attribute= E1.getAttribute("class");
		System.out.println("Attribute of class is  "+attribute);
		
//		if (attribute.equals("inputtext _55r1 _6luy")) {
//			System.out.println("Test is PASS");
//		}
//			else {
//				System.out.println("Test is FAIL");
//			}
			driver.close();
		}

}
