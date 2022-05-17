import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Temporary {
	
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/acer/Desktop/HTML/slv.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement SLV_ListBox = driver.findElement(By.id("slv"));
		Select s = new Select(SLV_ListBox);
		
		WebElement first = s.getFirstSelectedOption();
		String text1 = first.getText();
		System.out.println(text1+" *******************FIRST SELECTED**************************");
		
		List<WebElement> all = s.getAllSelectedOptions();
		int count = all.size();
		System.out.println(count);
		
		for (int i = 0;i<count;i++) {
			WebElement num = all.get(i);
			String text =num.getText();
			System.out.println(text + "  *********************ALL SELECTED BY FOR LOOP********************");
		}
		
		
		Select s1 = new Select(SLV_ListBox);
		List<WebElement> all1 = s1.getAllSelectedOptions();
		int count1 = all1.size();
		System.out.println(count1);
		
		for (WebElement var1:all1) {
			String text2= var1.getText();
			System.out.println(text2 +"  **************************ALL SELECTED BY FOR EACH LOOP***************");
			
		}
		
		Thread.sleep(3000);
			
			driver.get("file:///C:/Users/acer/Desktop/HTML/MTR.html");
			WebElement mtr = driver.findElement(By.id("mtr"));
			Select s2 = new Select(mtr);
			List<WebElement> all3 = s2.getOptions();
			int count3 = all3.size();
			
			for (int i=0;i<count3;i++) {
				WebElement num3 = all3.get(i);
				String text3 = num3.getText();
				System.out.println(text3 +" ******************MTR ALL OPTIONS***************************");
			}
			
			Thread.sleep(3000);
			
			for (int j=count3-1;j>=0;j--)  {
				WebElement num4 = all3.get(j);
				String Text4= num4.getText();
				System.out.println(Text4 +"  **********************REVERSE ORDER**********************");
			}
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		driver.close();
		
		
	}
	
	

}
