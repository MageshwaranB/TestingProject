package com.javaTesting.testing;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrlPresentInaPage 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		System.out.println("No of tags in the page: "+tag.size());
		for (int i = 0; i < tag.size(); i++) {
			System.out.println("Text: "+tag.get(i).getText());
		}
		
	}
}
