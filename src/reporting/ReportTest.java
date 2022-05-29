package reporting;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportTest 
{
	@Test
	public void reporterTest1() {
		Reporter.log("This is TEST1");
		System.out.println("Test1");
	}
	
	@Test
	public void reporterTest2() {
		//Reporter.log("This is TEST1");
		System.out.println("Test2");
	}
	@Test
	public void reporterTest3() {
		//Reporter.log("This is TEST1");
		System.out.println("Test3");
	}
}
