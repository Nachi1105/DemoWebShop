package genericUtilities;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {

	public static void  takesScreenshot(WebDriver driver) {
		
		/*TakesScreenshot ts = (TakesScreenshot) driver;	
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./src/test/resources/screenshots/"+Java_Utility.getName()+".png");		
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./src/test/resources/demo/"+Java_Utility.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void takesScreenshot(WebElement element) {
		
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/screenshots/"+Java_Utility.getName()+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void scrollToElement(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);

	}
	
	public static void selectDropdownOptions(WebElement dropdownElement, String option) {
		
		Select sel = new Select(dropdownElement);
		sel.selectByVisibleText(option);

	}
	
	public static void switchToWindowByTitle(WebDriver driver, String title) {
		
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowHandle);
		
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if (driver.getTitle().contains(title)) {
				break;
			}
		}
		
	}
	
	public static void switchToWindowByURL(WebDriver driver, String url) {
		
		String parentWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		allWindowHandles.remove(parentWindowHandle);
		
		for (String windowHandle : allWindowHandles) {
			driver.switchTo().window(windowHandle);
			if (driver.getCurrentUrl().contains(url)) {
				break;
			}
		}
		
	}
}