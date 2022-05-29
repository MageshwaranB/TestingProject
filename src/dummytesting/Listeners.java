package dummytesting;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.javaTesting.testing.ScreenShotProgram;

public class Listeners extends ScreenShotProgram implements ITestListener {
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Method name: "+result.getName());
		System.out.println("Test is starting");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Status of execution: "+result.getStatus());
		System.out.println("Test is starting");
	}
	public void onTestFailure(ITestResult result) {
		int i=0;
		System.out.println("On failure, SS will be taken");
		try {
			getSS("FailureSS"+i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i++;
		//Reporter.log("<a href=\"E : \Java Workspace\TestingProject\Screenshots\FailureSS0.png\">"Test Results"</a>");
	}
}
