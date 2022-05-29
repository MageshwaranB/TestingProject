package com.javaTesting.testing;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandling
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.id("tinymce"));
		ele.clear();
		Thread.sleep(3000);
		ele.sendKeys("Mageshwaran");
		Thread.sleep(4000);
		driver.close();
	}
}
