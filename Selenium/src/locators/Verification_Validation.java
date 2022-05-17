package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verification_Validation {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@class='login_Btn']")).click();
		
		String tittle= driver.getTitle();
		System.out.println("The Tittle Is : " + tittle);
		
		
		if (tittle.equals("SkillRary Ecommerce")) {
			System.out.println("Tittle is Matching, TEST IS PASS");
		}
		else {
			System.out.println("Tittle is Not Matching, TEST IS FAIL");
		}
		
				
		driver.close();
	}

}
