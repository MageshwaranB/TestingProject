package dummytesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionEg 
{
	@Test
	public void titleTest() throws InterruptedException {
		SoftAssert softAssert=new SoftAssert();
		String expTitle="Online Shoppings site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String actTitle=driver.getTitle();
		String expText="Germany";
		System.out.println("Verifying Title");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		String actText = driver.findElement(By.xpath("//a[text()='Germany']")).getText();
		System.out.println(actText);
		
		System.out.println("Verifying text");
		softAssert.assertEquals(actText, expText);
		softAssert.assertEquals(actTitle, expTitle);
		System.out.println("Closing the browser");
		driver.close();
		softAssert.assertAll();
	}
}
