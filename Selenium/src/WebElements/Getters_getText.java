package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getters_getText {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement txt1 = driver.findElement(By.xpath("//h2[@class='_8eso']"));
		 String txt2= txt1.getText();
		 System.out.println(txt2);
		 
		 String verification= "Facebook helps you connect and share with the people in your life.";
		 
		 if (txt2.equals(verification)) {
			 System.out.println("Text Is Matching, TEST IS PASS");
		 }
		 
		 else {
			 System.out.println("Text is not Matching, TEST IS FAIL");
		 }
				 

		 driver.close();
	}

}
