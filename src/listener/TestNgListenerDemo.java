package listener;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class TestNgListenerDemo 
{
	@Test
	public void test1() {
		System.out.println("I'm inside test1");
	}
	
	@Test
	public void test2() {
		System.out.println("I'm inside test1");
		Assert.fail();
	}
	
	@Test
	public void test3() {
		System.out.println("I'm inside test1");
		throw new SkipException("This test is skipped");
	}
}
