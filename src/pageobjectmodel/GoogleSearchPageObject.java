package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageObject 
{
	WebDriver driver=null;
	By textboxSearch=By.name("q");
	By buttonSearch=By.name("btnK");
	
	public GoogleSearchPageObject(WebDriver driver) 
	{
		this.driver=driver;
	}
	public void setTextInSearchBox(String text) 
	{
		driver.findElement(textboxSearch).sendKeys(text);
	}
	public void clickOnSearchButton()
	{
		driver.findElement(buttonSearch).sendKeys(Keys.RETURN);
	}
}
