package genericUtilities;

//import java.io.File;
//import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class Listeners_Implementation extends BaseTest implements ITestListener {

		@Override
		public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		BaseTest.test.log(Status.FAIL, result.getTestName()+"  is Fail");
		TakesScreenshot ts = (TakesScreenshot) BaseTest.sDriver;
		String base64 = ts.getScreenshotAs(OutputType.BASE64);
		BaseTest.test.addScreenCaptureFromBase64String(base64, result.getTestName());
		
	}

	/*	@Override
		public void onTestSuccess(ITestResult result) {
			// TODO Auto-generated method stub
			ITestListener.super.onTestSuccess(result);
			
			TakesScreenshot ts = (TakesScreenshot) BaseTest.sDriver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./src/test/resources/demo/DWS_pass_"+Java_Utility.getName()+".png");
			try {
				FileHandler.copy(src, dest);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	*/
}
