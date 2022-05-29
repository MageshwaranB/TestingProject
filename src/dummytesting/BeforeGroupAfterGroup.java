package dummytesting;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "user-registration")
public class BeforeGroupAfterGroup
{
	@BeforeGroups(value = "regression")
	public void beforeGroup() {
		System.out.println("Running this before regression group");
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
	@AfterGroups(value = "bvt")
	public void afterGroup() {
		System.out.println("Execute this after BVT");
	}

}
