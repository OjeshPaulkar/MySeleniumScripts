package handeling_ListBox_DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintIn_ReverseOrder {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/HTML/MTR.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement MTR_ListBox  = driver.findElement(By.id("mtr"));
		Select s = new Select(MTR_ListBox);
		List<WebElement> allOptions = s.getOptions();
		int count =allOptions.size();
		
		
		System.out.println("**********ALL OPTIONS IN REVERSE ORDER*********");
		
		for (int j=count-1;j>=0;j--) {
			WebElement num = allOptions.get(j);
			String text = num.getText();
			System.out.println(text);
		}

		driver.close();
}
}
