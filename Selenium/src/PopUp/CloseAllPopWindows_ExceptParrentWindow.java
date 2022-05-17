package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to Close All the Opened Windows EXCEPT the Parent Window

public class CloseAllPopWindows_ExceptParrentWindow {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> AllWin = driver.getWindowHandles();
		
		for(String all:AllWin) {
			driver.switchTo().window(all);
			if (all.equals(parent)) {
			//	driver.close();           //If we want to close only parent window**************
			}
			else {
			driver.close();
			}
		}

}
}
