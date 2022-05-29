package dummytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTestforListener 
{
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
	}
	
	@AfterSuite
	public void closingBrowser() {
		
		driver.close();
	}
	
	
}
