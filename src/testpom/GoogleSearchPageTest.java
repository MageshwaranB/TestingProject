package testpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectmodel.GoogleSearchPageObject;

public class GoogleSearchPageTest
{
	static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException 
	{
		googleSearchTest();
	}
	public static void googleSearchTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		GoogleSearchPageObject searchPageobject=new GoogleSearchPageObject(driver);
		driver.get("https://www.google.com/");
		searchPageobject.setTextInSearchBox("amazon");
		Thread.sleep(1000);
		searchPageobject.clickOnSearchButton();
		driver.close();
	}
}
