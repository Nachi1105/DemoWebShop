package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public Cart_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "termsofservice")
	private WebElement termsChkBox;
	
	public WebElement getTermsChkBox() {
		return termsChkBox;
	}

	@FindBy(xpath = "//input[@value='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath = "//input[@value='1']")
	private WebElement updCartTF;
	
	@FindBy(name = "updatecart")
	private WebElement updCartBtn;
	
	@FindBy(name = "removefromcart")
	private WebElement removeCart;
	
	@FindBy(id = "checkout")
	private WebElement checkBtn;

	public WebElement getCheckBtn() {
		return checkBtn;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getUpdCartTF() {
		return updCartTF;
	}

	public WebElement getUpdCartBtn() {
		return updCartBtn;
	}

	public WebElement getRemoveCart() {
		return removeCart;
	}

}
