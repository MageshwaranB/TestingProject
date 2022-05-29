package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNgListenerDemo2 
{
	@Test
	public void test4() {
		System.out.println("I'm inside test1");
	}
	
	@Test
	public void test5() {
		System.out.println("I'm inside test1");
		Assert.fail();
	}
	
	@Test
	public void test6() {
		System.out.println("I'm inside test1");
		throw new SkipException("This test is skipped");
	}
}
