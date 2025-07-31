package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orders_Page {

	public Orders_Page(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//strong[text()='Order Number: 1961206']/../..//input[@value='Details'])[1]")
	private WebElement dtlsOfOrds;

	public WebElement getDtlsOfOrds() {
		return dtlsOfOrds;
	}
	
	@FindBy(xpath = "//div[@class='center-1']")
	private WebElement orderDtlsSshot;

	public WebElement getOrderDtlsSshot() {
		return orderDtlsSshot;
	}
	
	@FindBy(xpath = "//div[@class='page-title']")
	private WebElement scrollToDtls;

	public WebElement getScrollToDtls() {
		return scrollToDtls;
	}
}
