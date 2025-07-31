package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishList_Page {

	public WishList_Page(WebDriver driver) {
			
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "addtocart")
	private WebElement addToCartCheckBox;

	public WebElement getAddToCartCheckBox() {
		return addToCartCheckBox;
	}
	
	@FindBy(name = "removefromcart")
	private WebElement remFromWishCheck;

	public WebElement getRemFromWishCheck() {
		return remFromWishCheck;
	}
	
	@FindBy(xpath = "//input[@class='qty-input']")
	private WebElement wishQty;

	public WebElement getWishQty() {
		return wishQty;
	}
	
	@FindBy(name = "updatecart")
	private WebElement updtWish;

	public WebElement getUpdtWish() {
		return updtWish;
	}
	
	@FindBy(name = "addtocartbutton")
	private WebElement wishPageCartBtn;

	public WebElement getWishPageCartBtn() {
		return wishPageCartBtn;
	}
	
}
