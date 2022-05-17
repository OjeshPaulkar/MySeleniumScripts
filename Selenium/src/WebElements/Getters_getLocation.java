package WebElements;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters_getLocation {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement E1 = driver.findElement(By.id("email"));
		Point P1= E1.getLocation();
		int X1= P1.getX();
		int Y1= P1.getY();
		
		System.out.println("Location of X1 is = "+X1);
		System.out.println("Location of Y1 is = "+Y1);
		
		
		WebElement E2 = driver.findElement(By.id("passContainer"));
		Point P2 = E2.getLocation();
		int X2= P2.getX();
		int Y2= P2.getY();
		
		System.out.println("Location of X2 is = "+X2);
		System.out.println("Location of Y2 is = "+Y2);
		
		if (X1==X2) {
			System.out.println("Test is PASS");
		}
		else {
			System.out.println("Test is FAIL");
		}
		
			driver.close();
		
	}

}
