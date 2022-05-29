package dummytesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.CommonSetup;

public class DummyDemoSuite extends CommonSetup
{
	@Test
	public void signin() {
		System.out.println("Sigining to Facebook");
	}
	@Test
	public void signout() {
		System.out.println("Signout from facebook");
		Assert.assertTrue(false);
	}
}
