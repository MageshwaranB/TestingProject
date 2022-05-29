package dummytesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DataProviderEg2
{
	@DataProvider
	public Object[][] dataSet2() {
		return new Object[][] {
			{"mageshbalraj@gmail.com","zaemon"},
			{"heromack10@gmail.com","zaemon"}
		};
	}
	
	@Test(dataProvider = "dataSet2")
	public void fbLogin(String uname,String pword) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		SoftAssert softAssert=new SoftAssert();
		String expText="Facebook";
		String actText = driver.getTitle();
		softAssert.assertEquals(actText, expText);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//div[4]/div/span)[1]")).click();
		driver.findElement(By.xpath("(//div/div/div[4]/div/div)[6]")).click();
		driver.close();
		
	}
}
