package object_Repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcome_Page {

	public Welcome_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	public WebElement getLoginLink() {
		return loginLink;
	}
	
	@FindBy(name = "q")
	private WebElement searchTF;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchBtn;
	
	@FindBy(linkText  = "Shopping cart")
	private WebElement shoppingLink;
	
	@FindBy(linkText = "Apparel & Shoes")
	private WebElement shoesLink;
	
	public WebElement getShoesLink() {
		return shoesLink;
	}

	@FindBy(linkText = "Wishlist")
	private WebElement wishLink;

	public WebElement getWishLink() {
		return wishLink;
	}

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public WebElement getShoppingLink() {
		return shoppingLink;
	}
	
	@FindBy(xpath =   "//a[@href='/electronics']")
	private WebElement electronLink;

	public WebElement getElectronLink() {
		return electronLink;
	}
	
}