package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WAS To Close Only Parent Window And Do not Close Child Windows

public class CloseParrentWindowOnly {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/multiplewindows/");
		String ParrentWindowHandle = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		driver.findElement(By.id("button1")).click();
		
		Set<String> AllWin = driver.getWindowHandles();
		
		for (String pa:AllWin) {
			driver.switchTo().window(pa);
			if(pa.equals(ParrentWindowHandle)) {
				driver.close();
			}
			else {
		}
			

		}
	}
}

