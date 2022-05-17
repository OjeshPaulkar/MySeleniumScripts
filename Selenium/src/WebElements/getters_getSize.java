package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getters_getSize {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement E1 = driver.findElement(By.id("email"));
		Dimension D1 = E1.getSize();
		int UsernameHeight =D1.getHeight();
		int UsernameWidth = D1.getWidth();
		WebElement E2 = driver.findElement(By.id("passContainer"));
		Dimension D2 = E2.getSize();
		int passHeight = D2.getHeight();
		int passWidth = D2.getWidth();
		
		System.out.println(UsernameHeight);
		System.out.println(UsernameWidth);
		System.out.println(passHeight);
		System.out.println(passWidth);
		
		driver.close();
		

}
}
