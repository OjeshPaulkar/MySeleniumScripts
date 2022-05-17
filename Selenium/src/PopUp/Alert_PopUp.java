package PopUp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='analystic'])[1]")).click();
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
	     
		
		Alert alert = driver.switchTo().alert();
		 //storeAlert();
		String text = alert.getText();
		System.out.println(text);
		Thread.sleep(3000);
		
		alert.accept();      //FOR CLICKING ON "OK"        
		
		//alert.dismiss();    (FOR CLICKING ON "CANCLE")
		
		
		if (text.equals("I am an alert box!")) {                     //VERIFICATION 
			System.out.println("Correct Alert Message");
		}
		else {
			System.out.println("Incorrect Alert Message");
		}
		
		driver.close();
		
		
	
	}

	
		
	}





