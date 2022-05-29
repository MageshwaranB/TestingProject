package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage 
{
	private static WebElement element1=null;
	public static WebElement textBoxSearch(WebDriver driver)
	{
		element1 = driver.findElement(By.name("q"));
		return element1;
	}
	public static WebElement buttonSearch(WebDriver driver) {
		element1=driver.findElement(By.xpath("(//input[@name=\"btnK\"])[1]"));
		return element1;
	}
	
}
