package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOut_Page {

	public CheckOut_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name = "billing_address_id")
	private WebElement addressDd;

	public WebElement getAddressDd() {
		return addressDd;
	}
	
	@FindBy(xpath = "//input[@value='Continue' and @onclick='Billing.save()']")
	private WebElement addContBtn;

	public WebElement getAddContBtn() {
		return addContBtn;
	}
	
	@FindBy(id = "PickUpInStore")
	private WebElement pcpChkBox;

	public WebElement getPcpChkBox() {
		return pcpChkBox;
	}
	
	@FindBy(xpath = "//input[@value='Continue' and @onclick='Shipping.save()']")
	private WebElement pkpContBtn;

	public WebElement getPkpContBtn() {
		return pkpContBtn;
	}
	
	@FindBy(xpath = "//input[@value='Payments.CashOnDelivery']")
	private WebElement coDRadio;

	public WebElement getCoDRadio() {
		return coDRadio;
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']")
	private WebElement payContBtn;

	public WebElement getPayContBtn() {
		return payContBtn;
	}
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']")
	private WebElement payInfoContBtn;

	public WebElement getPayInfoContBtn() {
		return payInfoContBtn;
	}
	
	@FindBy(xpath = "//div[@id='checkout-step-confirm-order']")
	private WebElement conOrderSs;

	public WebElement getConOrderSs() {
		return conOrderSs;
	}
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']")
	private WebElement conOrderBtn;

	public WebElement getConOrderBtn() {
		return conOrderBtn;
	}
	
	@FindBy(xpath = "//div[@class='footer-disclaimer']")
	private WebElement scrlToCpyRgt;

	public WebElement getScrlToCpyRgt() {
		return scrlToCpyRgt;
	}
}
