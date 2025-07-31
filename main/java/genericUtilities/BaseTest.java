package genericUtilities;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import object_Repository.Home_Page;
import object_Repository.Login_Page;
import object_Repository.Welcome_Page;

@Listeners(genericUtilities.Listeners_Implementation.class)
public class BaseTest {

	public WebDriver driver;
	public static WebDriver sDriver;
	public ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	
	@BeforeSuite(alwaysRun = true)
	public void configureReport() {
		
		spark = new ExtentSparkReporter("./src/main/resources/reports/DWS_Reports_"+Java_Utility.getName()+".html");
		spark.config().setReportName("Demo WEb Shop Report");
		spark.config().setDocumentTitle("Test Execution Report");
		spark.config().setTheme(Theme.DARK);
		report = new ExtentReports();
		report.attachReporter(spark);
		
	}
	
	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void openBrowser(@Optional("chrome") String browser) {
		
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			
		}
		sDriver = driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(File_Utility.getPropertyData("url"));
		
	}
	
	@BeforeMethod(alwaysRun = true)
	public void loginToDWS(Method method) {
		
		test = report.createTest(method.getName());
		Welcome_Page wp = new Welcome_Page(driver);
		wp.getLoginLink().click();
		test.log(Status.INFO, "Log in Page Displayed Successfully...");
		Login_Page lp = new Login_Page(driver);
		lp.getEmailTF().sendKeys(File_Utility.getPropertyData("email"));
		lp.getPassTF().sendKeys(File_Utility.getPropertyData("password"));
		lp.getLoginBtn().click();
		test.log(Status.INFO, File_Utility.getPropertyData("email")+" Logged in Successfully....");
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutFromDWS() {
		
		Home_Page hp = new Home_Page(driver);
		hp.getLogOutLink().click();
		test.log(Status.INFO, File_Utility.getPropertyData("email")+" Logged Out Successfully....");
	}
	
	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		
		driver.quit();

	}
	
	@AfterSuite(alwaysRun = true)
	public void saveReport() {
		
		report.flush();
	}
}