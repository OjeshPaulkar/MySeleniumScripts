package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//********************WAS to count the no.of windows opened and close them all*****************

public class Count_ChildWindows {
	
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
		
		Set<String> windowHandles = driver.getWindowHandles();
		int count = windowHandles.size();
		System.out.println("Total No. of open windows are " +count);
		
		driver.quit();
		
		
	}

}



