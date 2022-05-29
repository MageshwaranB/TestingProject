package com.javaTesting.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProgram1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		//EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
		driver.close();
		
	}
	
}
