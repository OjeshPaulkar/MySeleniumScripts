package handeling_ListBox_DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alphbetical_Order_print {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/Automation%20HTML/MTR.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	    WebElement mtrListBox = driver.findElement(By.id("mtr"));
	    Select s = new Select(mtrListBox);
	    List<WebElement> AllOptions = s.getOptions();
	    
	    ArrayList<String> a = new ArrayList<>();  ////*********************************
	    
	    for (WebElement Var1:AllOptions) {
	    	String text = Var1.getText();
	    	a.add(text);
	    }
	    
	    
	    Collections.sort(a);
	    System.out.println(a);
	    driver.close();

}
}
