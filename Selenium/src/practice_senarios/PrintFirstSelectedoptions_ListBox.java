package practice_senarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintFirstSelectedoptions_ListBox {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/HTML/slv.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement SLV_ListBox  = driver.findElement(By.id("slv"));
		Select s = new Select(SLV_ListBox);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String Text= firstSelectedOption.getText();
		System.out.println(Text);
		driver.close();
	}

}
