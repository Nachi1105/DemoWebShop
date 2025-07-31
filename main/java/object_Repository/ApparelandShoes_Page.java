package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelandShoes_Page {

	public ApparelandShoes_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "50's Rockabilly Polka Dot Top JR Plus Size")
	private WebElement topLink;

	public WebElement getTopLink() {
		return topLink;
	}
	
}
