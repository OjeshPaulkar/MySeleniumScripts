package iFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrame_indexNumber {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/iFrame/frame1.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Frame--1
		driver.findElement(By.id("t1")).sendKeys("a");
		
		//Switching TO Frame--2
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("b");
		
		//Switching Back To frame--1  *****defaultContent()**********
		driver.switchTo().defaultContent();  
		driver.findElement(By.id("t1")).sendKeys("c");
		
		//Switching Again To Frame--2  
		driver.switchTo().frame(0);
		driver.findElement(By.id("t2")).sendKeys("d");
		
		
		

}
}
