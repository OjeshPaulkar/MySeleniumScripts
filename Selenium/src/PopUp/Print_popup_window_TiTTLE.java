package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS to Print The Tittles Of Multiple Windows Opened
// switchTo()

public class Print_popup_window_TiTTLE {

	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		driver.manage().window().maximize();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click(); 
		Set<String> Var1 = driver.getWindowHandles();
	  
		
		for(String a:Var1)  {
			driver.switchTo().window(a);   //------*****IMP******--------//
			String title = driver.getTitle();
			System.out.println("The Tittle Of Windows Aree " +title);
		}
		
		driver.quit();
}
}
