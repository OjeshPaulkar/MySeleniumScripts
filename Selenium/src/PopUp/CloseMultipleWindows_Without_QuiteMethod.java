package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to close multiple windows without using Quite()

public class CloseMultipleWindows_Without_QuiteMethod {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		Set<String> Var1 = driver.getWindowHandles();
		
		for(String all:Var1) {
			driver.switchTo().window(all);
			//System.out.println(driver.getTitle());
			driver.close();
		}

}
}
