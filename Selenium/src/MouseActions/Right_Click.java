package MouseActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		WebElement E1 = driver.findElement(By.partialLinkText("actiTIME Inc."));
		Actions a= new Actions(driver);
		a.contextClick(E1).perform();
		
		//KeyBoard Action to open it in new window
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_W);
		
	}
}
