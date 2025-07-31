package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public Login_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	private WebElement emailTF;
	
	public WebElement getEmailTF() {
		return emailTF;
	}
	
	@FindBy(name = "Password")
	private WebElement passTF;

	public WebElement getPassTF() {
		return passTF;
	}
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
}
