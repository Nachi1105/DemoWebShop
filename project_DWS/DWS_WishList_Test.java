package project_DWS;


import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseTest;
import genericUtilities.WebDriver_Utility;
import object_Repository.ApparelandShoes_Page;
import object_Repository.Product_Page;
import object_Repository.Welcome_Page;
import object_Repository.WishList_Page;

public class DWS_WishList_Test extends BaseTest{

	@Test(priority = 1)
	public void addToWishlist()  {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getShoesLink().click();
		test.log(Status.INFO, "Shoes Page Displayed Successfully...");
		ApparelandShoes_Page ap = new ApparelandShoes_Page(driver);
		ap.getTopLink().click();
		test.log(Status.INFO, "Product Page Displayed Successfully...");
		Product_Page pp = new Product_Page(driver);
		pp.getWishBtn().click();
		wp.getWishLink().click();
		WebDriver_Utility.takesScreenshot(driver);
		test.log(Status.PASS, "Product was Added to Wishlist Successfully...");
		
	}
	
	@Test(priority = 2)
	public void updateWishlist() {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getWishLink().click();
		test.log(Status.INFO, "Wishlist Page Displayed Successfully...");
		WishList_Page wlp = new WishList_Page(driver);
		wlp.getWishQty().clear();
		wlp.getWishQty().sendKeys("5");
		wlp.getUpdtWish().click();
		WebDriver_Utility.takesScreenshot(driver);
		test.log(Status.PASS, "Product Count was Updated Successfully...");
		
	}
	
	@Test(priority = 3)
	public void addToCartFromWishlist() {
		
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getWishLink().click();
		test.log(Status.INFO, "Wishlist Page Displayed Successfully...");
		WishList_Page wlp = new WishList_Page(driver);
		wlp.getAddToCartCheckBox().click();
		wlp.getWishPageCartBtn().click();
		wp.getShoppingLink().click();
		WebDriver_Utility.takesScreenshot(driver);
		test.log(Status.INFO, "Product was Added to Cart From Wishlist Successfully...");
	}
	
}
