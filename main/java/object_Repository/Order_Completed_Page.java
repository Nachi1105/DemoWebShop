package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_Completed_Page {

	public Order_Completed_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement contiBtn;

	public WebElement getContiBtn() {
		return contiBtn;
	}
	
	
}
