package handeling_ListBox_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class entering_DOB {
	
	 static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		WebElement DateListBox = driver.findElement(By.id("day"));
		WebElement MonthListBox = driver.findElement(By.id("month"));
		WebElement YearListBox = driver.findElement(By.id("year"));
		
		Select sd = new Select(DateListBox);
		Select sm = new Select(MonthListBox);
		Select sy = new Select(YearListBox);
		
		Thread.sleep(3000);

		sd.selectByValue("4");
		sm.selectByIndex(4);
		sy.selectByVisibleText("1992");
	
		Thread.sleep(3000);
		
		driver.close();
		

}
}
