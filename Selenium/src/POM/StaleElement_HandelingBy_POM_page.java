package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StaleElement_HandelingBy_POM_page {
	
	@FindBy(name="q")
	private WebElement searchBox;
	
	public StaleElement_HandelingBy_POM_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void search(String searchValue) {
		searchBox.sendKeys(searchValue);
	}

}
