package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
	
	
	@Test
	public void logIn() {
		System.out.println("Hiee");    //SysO will print in console, But this statement will NOT be shown in Emailable report.html
		
		Reporter.log("Hello", true);  //This will print in console and will also be present in emailable report.html
		Reporter.log("welcome",false);  //This will NOT print in console but it will be present in emailable report
	}
	

}
