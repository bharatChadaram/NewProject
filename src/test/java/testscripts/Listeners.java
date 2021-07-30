package testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import global.Base;

public class Listeners extends Base implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		WebDriver driver = null;
		String  testMethodname = result.getMethod().getMethodName();
		try 
		{
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}

		try 
		{
			getScreenshotPath(testMethodname,driver);
		} 
		catch (IOException e)
		{
			
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}

}
