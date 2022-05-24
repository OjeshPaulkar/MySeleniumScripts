package PopUp;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUp_fileUpload_GENERIC {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/Automation%20HTML/upload.html");
		File f = new File("./data/demo.pdf");
		String aPath = f.getAbsolutePath();
		driver.findElement(By.id("cv")).sendKeys(aPath);
	
		
	}
	}



