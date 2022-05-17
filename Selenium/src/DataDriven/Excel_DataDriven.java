package DataDriven;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel_DataDriven {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws  IOException, FileNotFoundException {
	FileInputStream f1= new FileInputStream("./Book1.xlsx");
	Workbook wb = WorkbookFactory.create(f1);
	String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String un = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String pass = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	
	WebDriver driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.id("email")).sendKeys(un);
	driver.findElement(By.id("password")).sendKeys(pass);
	driver.findElement(By.id("last")).click();
	}

}
