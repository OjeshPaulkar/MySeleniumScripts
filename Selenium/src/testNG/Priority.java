package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
	
	@Test (priority=2)
	public void WhatsUpcall() {
		Reporter.log("whats up calling", true);
	}
	
	@Test(priority=4,enabled=false)              //Disabeling This Method
	public void WhatsUpPay() {
		Reporter.log("whats up Calling", true);
	}
	
	@Test(priority=1)
	public void WhatsUpMessage() {                   //****???????????
		Reporter.log("whats up Message", true);
	}
	
	@Test(priority=3)
	public void WhatsUpStatus() {
		Reporter.log("whats up Status", true);
	}

}
