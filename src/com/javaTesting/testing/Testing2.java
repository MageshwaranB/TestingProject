package com.javaTesting.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing2
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String var = driver.getTitle();
		System.out.println("Actual Title: "+var);
		driver.findElement(By.id("email")).sendKeys("mageshbalraj@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("zaemon");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		String homepage = driver.getTitle();
		System.out.println(homepage);
	}
}
