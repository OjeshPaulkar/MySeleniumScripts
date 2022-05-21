package autoLink;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_All_AutoSuggetions {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement SearchBox = driver.findElement(By.name("q"));
		SearchBox.sendKeys("Selenium");
		Thread.sleep(3000);
		List<WebElement> List = driver.findElements(By.xpath("//li[@class='sbct']"));          // <li>  Always list tag has to be found
		int count = List.size();
		System.out.println("The No. Of Auto Suggetions Are  "+count);
		
		for (int i=0;i<count;i++) {                          //*********************USING FOR LOOP*******************************
			WebElement AutoSuggetions = List.get(i);
			String text = AutoSuggetions.getText();
			Thread.sleep(2000);
			System.out.println(text);
		}
		
		
		for (WebElement Var1:List) {                         //*******************USING FOR EACH LOOP*****************************
			String text1 = Var1.getText();
			System.out.println(text1);	
		}
	    WebElement thirdE = List.get(3);
	    System.out.println(thirdE.getText());
		List.get(3).click();
		
		
		
	}

}
