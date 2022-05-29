package dummytesting;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeTestBeforeMethodEg
{
	@BeforeTest
	public void LoginToApplication() {
		System.out.println("Login to the application");
	}
	@AfterTest
	public void LogoutApplication() {
		System.out.println("Logout from the application");
	}
	@Test
	public void Test1() {
		System.out.println("Test1");
	}
	@Test
	public void Test2() {
		System.out.println("Test2");
	}
	@BeforeMethod
	public void connectToDb() {
		System.out.println("Connecting to database");
	}
	@AfterMethod
	public void disConnectToDb() {
		System.out.println("Disconnecting from database");
	}
}
