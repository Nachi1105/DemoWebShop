package project_DWS;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import genericUtilities.BaseTest;
import genericUtilities.WebDriver_Utility;
import object_Repository.Account_Page;
import object_Repository.Add_Edit_Address_Page;
import object_Repository.Addresses_Page;

	public class DWS_Address_Test extends BaseTest {

		@Test(priority = 1, groups = "smoke")
		public void addAddress() throws Exception {
			
			Account_Page ap = new Account_Page(driver);
			ap.getAccount().click();
			test.log(Status.INFO, "User Account Page Dispalyed Successfully...");
			Addresses_Page asp = new Addresses_Page(driver);
			asp.getAddressLink().click();
			test.log(Status.INFO, "Address Page Dispalyed Successfully...");
			asp.getAddNewAddBtn().click();
			test.log(Status.INFO, "Add New Address Page Dispalyed Successfully...");
			Add_Edit_Address_Page addEdit = new Add_Edit_Address_Page(driver);
			addEdit.getaFName().sendKeys("Nachi");
			addEdit.getaLName().sendKeys("Muthu");
			addEdit.getaEmail().sendKeys("nachi999@gmail.com");
			WebDriver_Utility.selectDropdownOptions(addEdit.getCountry(), "India");
			addEdit.getCity().sendKeys("Namakkal");
			addEdit.getAddress1().sendKeys("Sowdhapuram, Veppadai");
			addEdit.getPincode().sendKeys("638008");
			addEdit.getaPhone().sendKeys("9856214730");
			addEdit.getSaveBtn().click();
			Thread.sleep(2000);
			WebElement aAddress = driver.findElement(By.xpath("//strong[text()='Nachi Muthu']/ancestor::div[@class='section address-item']"));
			WebDriver_Utility.takesScreenshot(aAddress);
			test.log(Status.PASS, "A New Address Added Successfully...");
			
		}
		
		@Test(priority = 2, groups = "smoke")
		public void updateAddress() throws Exception {
						
			Account_Page ap = new Account_Page(driver);
			ap.getAccount().click();
			test.log(Status.INFO, "User Account Page Dispalyed Successfully...");
			Addresses_Page asp = new Addresses_Page(driver);
			asp.getAddressLink().click();
			test.log(Status.INFO, "Address Page Dispalyed Successfully...");
			asp.getEditAdrsBtn().click();
			test.log(Status.INFO, "Edit Address Page Dispalyed Successfully...");
			Add_Edit_Address_Page addEdit = new Add_Edit_Address_Page(driver);
			addEdit.getaFName().clear();
			addEdit.getaFName().sendKeys("Dhanesh");
			addEdit.getaLName().clear();
			addEdit.getaLName().sendKeys("Kumar");
			addEdit.getaEmail().clear();
			addEdit.getaEmail().sendKeys("dk123@gmail.com");
			addEdit.getaPhone().clear();
			addEdit.getaPhone().sendKeys("6378345678");
			Thread.sleep(2000);
			addEdit.getSaveBtn().click();
			WebElement eAddress = driver.findElement(By.xpath("//strong[text()='Dhanesh Kumar']/ancestor::div[@class='section address-item']"));
			WebDriver_Utility.takesScreenshot(eAddress);	
			test.log(Status.PASS, "Address Edited Successfully...");
			
		}
		
		@Test(priority = 3, groups = "sanity")
		public void removeAddress() throws Exception {
			
			Account_Page ap = new Account_Page(driver);
			ap.getAccount().click();
			test.log(Status.INFO, "User Account Page Dispalyed Successfully...");
			Addresses_Page asp = new Addresses_Page(driver);
			asp.getAddressLink().click();
			test.log(Status.INFO, "Address Page Dispalyed Successfully...");
			WebElement dAddress = driver.findElement(By.xpath("//strong[text()='Dhanesh Kumar']/ancestor::div[@class='section address-item']"));
			asp.getDltAdrsBtn().click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
			WebDriver_Utility.takesScreenshot(dAddress);
			test.log(Status.PASS, "Address Deleted Successfully...");

	}

}