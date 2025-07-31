package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {

	public Register_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "gender-male")
	private WebElement maleradio;
	
	@FindBy(id = "gender-female")
	private WebElement femaleradio;
	
	@FindBy(id = "FirstName")
	private WebElement fName;
	
	@FindBy(id = "LastName")
	private WebElement lName;
	
	@FindBy(name = "Email")
	private WebElement email;
	
	@FindBy(name = "Password")
	private WebElement pass;
	
	@FindBy(name = "ConfirmPassword")
	private WebElement conPass;
	
	@FindBy(xpath = "//input[@value='Register']")
	private WebElement regBtn;

	public WebElement getMaleradio() {
		return maleradio;
	}

	public WebElement getFemaleradio() {
		return femaleradio;
	}

	public WebElement getfName() {
		return fName;
	}

	public WebElement getlName() {
		return lName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getConPass() {
		return conPass;
	}

	public WebElement getRegBtn() {
		return regBtn;
	}
	
}
