package common;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class CommonSetup 
{
	@BeforeSuite
	public void dataSetup() {
		System.out.println("Common data setup");
	}
	@AfterSuite
	public void dataTearDown() {
		System.out.println("Common tear down");
	}
}
