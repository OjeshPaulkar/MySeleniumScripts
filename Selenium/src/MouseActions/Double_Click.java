package MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");                 
		driver.manage().window().maximize();
		String title2 = driver.getTitle();                          //Validating
		System.out.println("The Tittle of Main page Is " +title2);
		String currentUrl2 = driver.getCurrentUrl();                //Validating
		System.out.println("URL of Main page is " +currentUrl2);
		WebElement E1 = driver.findElement(By.partialLinkText("COURSE"));
		Actions a = new Actions(driver);
		Thread.sleep(3000);
		a.moveToElement(E1).perform();
		driver.findElement(By.partialLinkText("Selenium Training")).click();
		WebElement E2 = driver.findElement(By.id("add"));
		
		a.doubleClick(E2).perform();      //DoubleClick on ADD Button
		
		//-----------Getting Tittle--------------
		
		String title = driver.getTitle();                        //Validating
		System.out.println("The Tittle of Finala page Is " +title);
		
		String currentUrl = driver.getCurrentUrl();                 //Validating
		System.out.println("URL of final page is " +currentUrl);
	}

}



