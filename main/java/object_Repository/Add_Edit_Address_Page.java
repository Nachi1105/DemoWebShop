package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Edit_Address_Page {//correct
	
	public Add_Edit_Address_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "Address_FirstName")
	private WebElement aFName;
	
	@FindBy(id = "Address_LastName")
	private WebElement aLName;
	
	@FindBy(id = "Address_Email")
	private WebElement aEmail;
	
	@FindBy(id = "Address_CountryId")
	private WebElement country;
	
	@FindBy(name = "Address.City")
	private WebElement city;
	
	@FindBy(name = "Address.Address1")
	private WebElement address1;
	
	@FindBy(name = "Address.ZipPostalCode")
	private WebElement pincode;
	
	@FindBy(name = "Address.PhoneNumber")
	private WebElement aPhone;
	
	@FindBy(xpath = "//input[@value='Save']")
	private WebElement saveBtn;

	public WebElement getaFName() {
		return aFName;
	}

	public WebElement getaLName() {
		return aLName;
	}

	public WebElement getaEmail() {
		return aEmail;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getaPhone() {
		return aPhone;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
}

//@FindBy(id = "Address_FirstName")
//private WebElement eFN;
//	
//@FindBy(id = "Address_LastName")
//private WebElement eLN;
//	
//@FindBy(id = "Address_Email")
//private WebElement eEmail;
//	
//@FindBy(id = "Address_CountryId")
//private WebElement eCountry;
//	
//@FindBy(name = "Address.City")
//private WebElement eCity;
//	
//@FindBy(name = "Address.Address1")
//private WebElement eAddress1;
//	
//@FindBy(name = "Address.ZipPostalCode")
//private WebElement ePincode;
//	
//@FindBy(name = "Address.PhoneNumber")
//private WebElement ePhone;
//	
//@FindBy(xpath = "//input[@value='Save']")
//private WebElement eSaveBtn;
//
//public WebElement geteFN() {
//	return eFN;
//}
//
//public WebElement geteLN() {
//	return eLN;
//}
//
//public WebElement geteEmail() {
//	return eEmail;
//}
//
//public WebElement geteCountry() {
//	return eCountry;
//}
//
//public WebElement geteCity() {
//	return eCity;
//}
//
//public WebElement geteAddress1() {
//	return eAddress1;
//}
//
//public WebElement getePincode() {
//	return ePincode;
//}
//
//public WebElement getePhone() {
//	return ePhone;
//}
//
//public WebElement geteSaveBtn() {
//	return eSaveBtn;
//}