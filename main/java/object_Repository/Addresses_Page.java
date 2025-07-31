package object_Repository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Addresses_Page {//correct
	
	public Addresses_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Addresses")
	private WebElement addressLink;

	public WebElement getAddressLink() {
		return addressLink;
	}
	
	@FindBy(xpath = "//input[@value='Add new']")
	private WebElement addNewAddBtn;

	public WebElement getAddNewAddBtn() {
		return addNewAddBtn;
	}
	
	@FindBy(xpath = "//input[@value='Edit']")
	private WebElement editAdrsBtn;

	public WebElement getEditAdrsBtn() {
		return editAdrsBtn;
	}
	
	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement dltAdrsBtn;

	public WebElement getDltAdrsBtn() {
		return dltAdrsBtn;
	}
		
}
