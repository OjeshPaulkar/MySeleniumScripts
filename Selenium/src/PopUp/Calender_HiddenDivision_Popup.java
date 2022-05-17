package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Calender_HiddenDivision_Popup {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement Pno = driver.findElement(By.id("policynumber"));    
		Pno.sendKeys("69696969");    
		
		driver.findElement(By.id("dob")).click();     //click to get HiddenDivision Pop-up (CALENDER)
		Thread.sleep(3000);
	    
		WebElement month = driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));   //Month is DropDown use Select Class
	    Select s = new Select(month);
	    s.selectByValue("4");
	    Thread.sleep(3000);
	    
	    WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));    //Year is DropDown so use Select class
	    Select s1= new Select(year);
	    s1.selectByValue("1990");
	    Thread.sleep(3000);
	    
	    WebElement date = driver.findElement(By.xpath("(//a[@class='ui-state-default'])[4]"));     //Date is link so perform click action
	    date.click();
	    Thread.sleep(3000);
	    
	    WebElement Mobile = driver.findElement(By.id("alternative_number"));          //locating mobile no text box
	    Mobile.sendKeys("9876543210");                                              //sendind/typing mobile number
	    
	    WebElement renewButton = driver.findElement(By.xpath("(//button)[4]"));     //locating submit button
	    renewButton.click();                                                      //sumit/click on the button
	}


}
