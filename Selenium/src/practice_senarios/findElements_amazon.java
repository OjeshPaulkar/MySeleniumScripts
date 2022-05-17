package practice_senarios;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements_amazon {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		WebElement E1 = driver.findElement(By.id("twotabsearchtextbox"));
		E1.sendKeys("ipad");
		Thread.sleep(5000);
		List<WebElement> List = driver.findElements(By.xpath("//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		int Size = List.size();
		
		System.out.println("The no. of Autosuggetuions are " +Size);
		
		for (WebElement Var1:List) {            //for each loop (returntype_of_array  var1:array_var)
			System.out.println(Var1.getText());
			
		}
		driver.close();
	}

}
