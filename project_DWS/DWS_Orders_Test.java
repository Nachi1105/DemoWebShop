package project_DWS;

import org.testng.annotations.Test;

import genericUtilities.BaseTest;
import genericUtilities.WebDriver_Utility;
import object_Repository.Account_Page;
import object_Repository.Cart_Page;
import object_Repository.CheckOut_Page;
import object_Repository.Electronics_Page;
import object_Repository.Order_Completed_Page;
import object_Repository.Orders_Page;
import object_Repository.Welcome_Page;

public class DWS_Orders_Test extends BaseTest {

	@Test(priority = 1)
	public void placeOrder() {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getElectronLink().click();
		Electronics_Page ep = new Electronics_Page(driver);
		ep.getPhoneLink().click();
		Cart_Page cp = new Cart_Page(driver);
		cp.getAddToCart().click();
		wp.getShoppingLink().click();
		cp.getTermsChkBox().click();
		cp.getCheckBtn().click();
		CheckOut_Page cop = new CheckOut_Page(driver);
		WebDriver_Utility.selectDropdownOptions(cop.getAddressDd(), "Dhanesh Kumar, Sowdhapuram, Veppadai, Namakkal 638008, India");
		cop.getAddContBtn().click();
		cop.getPcpChkBox().click();
		cop.getPkpContBtn().click();
		cop.getCoDRadio().click();
		WebDriver_Utility.scrollToElement(driver, cop.getScrlToCpyRgt());
		cop.getPayInfoContBtn().click();
		WebDriver_Utility.scrollToElement(driver, cop.getScrlToCpyRgt());
		WebDriver_Utility.takesScreenshot(cop.getConOrderSs());
		cop.getConOrderBtn().click();
		Order_Completed_Page ocp = new Order_Completed_Page(driver);
		ocp.getContiBtn().click();
		
	}
	
	@Test(priority = 2)
	public void fetchOrderDetails() throws Exception {
			
		Account_Page ap = new Account_Page(driver);
		ap.getAccount().click();
		ap.getOrderLink().click();
		Orders_Page op = new Orders_Page(driver);
		op.getDtlsOfOrds().click();
		WebDriver_Utility.scrollToElement(driver, op.getScrollToDtls());
		WebDriver_Utility.takesScreenshot(op.getOrderDtlsSshot());
		
	}
}
