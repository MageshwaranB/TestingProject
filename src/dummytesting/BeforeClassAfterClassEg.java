package dummytesting;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = "user-registration")
public class BeforeClassAfterClassEg

{
	@BeforeClass
	public void beforeClass() {
		System.out.println("It will before the class");
	}
	@Test(priority = 1,groups = "regression")
	public void aTest()
	{
		System.out.println("Test1");
	}
	@Test(priority = 2,groups = "regression")
	public void bTest() {
		System.out.println("Test2");
	}
	@Test(groups = {"regression","bvt"})
	public void cTest() {
		System.out.println("Test3");
	}
	@Test(groups = "bvt")
	public void dTest() {
		System.out.println("Test4");
	}
	@AfterClass
	public void afterClass() {
		System.out.println("It will after the class");
	}
	
}
