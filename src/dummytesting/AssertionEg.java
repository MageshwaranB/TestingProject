package dummytesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionEg 
{
	@Test
	public void titleTest() {
		String expTitle="Online Shoppings site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		driver.close();
	}
}
