package listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListener implements ITestListener
{
	public void onTestStart(ITestResult result) {
		System.out.println("****** Test Started: " + result.getName());
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("****** Test is successful: " + result.getName());
	}
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println("****** Test is a failure: " + result.getName());
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("****** Test is skipped: " + result.getName());
	}
	public void onFinish(ITestResult context)
	{
		System.out.println("****** Test is completed: " + context.getName());
	}
}
