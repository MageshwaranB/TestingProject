package dummytesting;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ListenerDemoTestWithRetry extends BaseTestforListener
{
	@Test(retryAnalyzer = dummytesting.Retry.class)
	public void lauchApp() {
		driver.get("https://www.ebay.com/");
		driver.findElement(By.xpath("//input[@type='tex']")).sendKeys("One Plus");
	}
}
