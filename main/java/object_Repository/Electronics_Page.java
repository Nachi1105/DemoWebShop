package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Electronics_Page {

	public Electronics_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[@href='/cell-phones'])[4]")
	private WebElement phoneLink;

	public WebElement getPhoneLink() {
		return phoneLink;
	}
	
}
