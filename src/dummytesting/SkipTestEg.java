package dummytesting;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestEg
{
	Boolean dataSetup=false;
	//1st way to skip a test
	@Test(enabled = false)
	public void skipTest1() 
	{
		System.out.println("Skipping this test since it is not complete");
	}
	//2nd way to skip a test
	@Test
	public void skipTest2() {
		System.out.println("Skipping this test forcefully");
		throw new SkipException("Skipping this test");
	}
	//3rd way to skip a test
	@Test
	public void skipTest3() {
		System.out.println("Skipping this test based on the condition");
		if (dataSetup==true) {
			System.out.println("Execute the test");
		}
		else
			System.out.println("Skipping the test");
			throw new SkipException("Don't execute further");
	}
}
