package practice_senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAutosuggetionAndPrint {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement E1 = driver.findElement(By.name("q"));
		E1.sendKeys("selenium");
		Thread.sleep(5000);
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sbct']"));
		int size = list.size();
		System.out.println("No. of AutoSuggetion is  " + size);
		
		for (WebElement AllAutoSuggetions:list) {
			System.out.println(AllAutoSuggetions.getText());
		}
		driver.close();

}
}
