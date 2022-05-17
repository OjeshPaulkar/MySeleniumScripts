package handeling_ListBox_DropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Without_Looping {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/HTML/MTR.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	    WebElement mtrListBox = driver.findElement(By.id("mtr"));
	    Select s = new Select(mtrListBox);
	    
	    WebElement AllOptions = s.getWrappedElement();    //*******************
	    String text = AllOptions.getText();
	    System.out.println(text);
	    
	    driver.close();
	}
	
}
