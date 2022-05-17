package practice_senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementS_myntra {
	
		
		static {
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAjwjZmTBhB4EiwAynRmD6-dT-pPe43bgV3hNaExQqjy55gUdBBrNHXf5NSOZrnuoVQeFNLUpRoCvWcQAvD_BwE");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
			WebElement E1 = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
			E1.sendKeys("shoes");
			Thread.sleep(5000);
			
			List<WebElement> list = driver.findElements(By.xpath("//li[@class='desktop-suggestion null']"));
			int size = list.size();
			System.out.println("No. of AutoSuggetion is  " + size);
			
			for (WebElement alsize:list) {
				System.out.println(alsize.getText());
			}
			driver.close();

	}
	

}



