package autoLink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_Links {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> AllLinks = driver.findElements(By.xpath("//a"));
		int count = AllLinks.size();
	    System.out.println(count);
	    
	    for (int i=0;i<count;i++) {                     //**********************USING FOR LOOP*************************
	    	WebElement Var1 = AllLinks.get(i);
	    	String text = Var1.getText();
	    	System.out.println(text);
	    }
	    
	    for (WebElement Var2:AllLinks) {               //***********************USING FOR EACH LOOP**********************
	    	String text2 = Var2.getText();
	    	System.out.println(text2);
	    }
	    driver.close();
	}

}
