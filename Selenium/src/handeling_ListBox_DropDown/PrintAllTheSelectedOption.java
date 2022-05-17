package handeling_ListBox_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllTheSelectedOption {
	
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
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		int count =allSelectedOptions.size();
		
		
		for(int i=0; i<count; i++) {
			WebElement num = allSelectedOptions.get(i);
			String text= num.getText();
			System.out.println(text);
		}
		
		driver.close();

}
}
