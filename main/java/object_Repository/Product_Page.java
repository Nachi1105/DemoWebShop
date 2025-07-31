package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {

	public Product_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "add-to-wishlist-button-5")
	private WebElement wishBtn;

	public WebElement getWishBtn() {
		return wishBtn;
	}
	
	
}
