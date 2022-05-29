package logincredentials;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utils.ExcelUtils;

public class Login 
{
	public Object[][] testData(String excelPath,String sheetName) throws IOException {
		Methods excel=new Methods(excelPath,sheetName);
		int rowCount=excel.getRowCount();
		int columnCount=excel.getColumnCount();
		Object[][] data=new Object[rowCount-1][columnCount];
		for (int i = 1; i < rowCount; i++)
		{
			for (int j = 0; j<columnCount; j++) {
				String testData=excel.getStringData(i,j);
				data[i-1][j]=testData;
			}
		}
		return data;
	}
	
	@DataProvider(name="testData")
	public Object[][] loginData() throws IOException 
	{
		Object[][] arr=testData("./excel/credentials.xlsx", "Sheet1");
		return arr;
	}
	
	@Test(dataProvider = "testData")
	public void loginToApplication(String uname,String pword) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver", "/Driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pword);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		boolean expVal = driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed();
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.findElement(By.xpath("//span[text()='Products']")).isDisplayed(), expVal);
		driver.quit();
		softAssert.assertAll();
		System.out.println(uname+"|"+pword);
	}
}
