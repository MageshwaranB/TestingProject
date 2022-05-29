package testpom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectmodel.GoogleSearchPage;
import testpom.*;
public class Trail1 
{
	private static WebDriver driver=null;
	public static void main(String[] args) {
		googleSearch();
	}
	public static void googleSearch() {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		GoogleSearchPage.textBoxSearch(driver).sendKeys("Amazon");
		GoogleSearchPage.textBoxSearch(driver).sendKeys(Keys.ENTER);
	}
}

