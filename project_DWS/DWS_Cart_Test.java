package project_DWS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseTest;
import genericUtilities.WebDriver_Utility;
import object_Repository.Cart_Page;
import object_Repository.Welcome_Page;

	public class DWS_Cart_Test extends BaseTest{

		@Test(priority = 1, groups = "smoke")
		public void addToCart() throws Exception {
			
			Welcome_Page wp = new Welcome_Page(driver);
			wp.getSearchTF().sendKeys("Laptop");
			wp.getSearchBtn().click();
			test.log(Status.INFO, "Product Searched Successfully...");
			WebElement laptop = driver.findElement(By.xpath("//a[text()='14.1-inch Laptop']/ancestor::div[@class='details']/descendant::input"));
			WebDriver_Utility.scrollToElement(driver, laptop);
			Thread.sleep(2000);
			laptop.click();
			Cart_Page cp = new Cart_Page(driver);
			cp.getAddToCart().click();
			WebDriver_Utility.takesScreenshot(driver);
			test.log(Status.PASS, "Product Added To Cart Successfully...");
			
		}
		
		@Test(priority = 2, groups = "smoke")
		public void updateCart() throws Exception {
			
			Welcome_Page wp = new Welcome_Page(driver);
			wp.getShoppingLink().click();
			test.log(Status.INFO, "Cart Page Dispalyed Successfully...");
			Cart_Page cp = new Cart_Page(driver);
			cp.getUpdCartTF().clear();
			cp.getUpdCartTF().sendKeys("3");
			Assert.assertEquals(cp.getUpdCartTF().getDomAttribute("value").equals("3"), true);
			cp.getUpdCartBtn().click();
			test.log(Status.PASS, "Product Updated Successfully...");
			WebDriver_Utility.takesScreenshot(driver);
			
		}
		
		@Test(priority = 3, groups = "sanity")
		public void removeFromCart() throws Exception {
			
			Welcome_Page wp = new Welcome_Page(driver);
			wp.getShoppingLink().click();
			test.log(Status.INFO, "Cart Page Dispalyed Successfully...");
			Cart_Page cp = new Cart_Page(driver);
			cp.getRemoveCart().click();
			cp.getUpdCartBtn().click();
			test.log(Status.PASS, "Product Removed From Cart Successfully...");
			WebDriver_Utility.takesScreenshot(driver);
			
		}

}