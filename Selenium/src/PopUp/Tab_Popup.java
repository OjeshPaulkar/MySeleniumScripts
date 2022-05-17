package PopUp;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab_Popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
//		String wh1 = driver.getWindowHandle();
		Set<String> WH = driver.getWindowHandles();
		int count = WH.size();
		System.out.println(count);
		
//		driver.switchTo().window(wh1);
//		Thread.sleep(3000);
//		driver.navigate().back();
//		Thread.sleep(3000);
		
		driver.quit();
	}

}
