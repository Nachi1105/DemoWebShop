package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Account_Page {

	public Account_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")
	private WebElement account;

	public WebElement getAccount() {
		return account;
	}
	
	@FindBy(linkText = "Orders")
	private WebElement orderLink;

	public WebElement getOrderLink() {
		return orderLink;
	}
	
}
