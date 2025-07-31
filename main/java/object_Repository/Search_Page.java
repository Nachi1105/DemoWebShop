package object_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {

	public Search_Page(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "q")
	private WebElement searchTF;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchBtn;

	public WebElement getSearchTF() {
		return searchTF;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
}
