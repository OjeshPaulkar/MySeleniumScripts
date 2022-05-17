package handeling_ListBox_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelecting {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/HTML/MTR.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement mtrListBox = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrListBox);
		Thread.sleep(3000);
		s.selectByIndex(0);
		Thread.sleep(3000);
		s.selectByValue("d");
		Thread.sleep(3000);
		s.selectByVisibleText("Vada");
		Thread.sleep(3000);
		
		if (s.isMultiple()==true) {
			Thread.sleep(3000);
			s.deselectByIndex(2);
			Thread.sleep(3000);
			s.deselectByVisibleText("Dosa");
			Thread.sleep(3000);
			s.deselectByValue("i");
		}
		
		Thread.sleep(3000);
		driver.close();
	
}
}
