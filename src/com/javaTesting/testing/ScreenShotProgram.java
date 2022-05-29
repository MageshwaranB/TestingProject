package com.javaTesting.testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

import dummytesting.BaseTestforListener;

public class ScreenShotProgram extends BaseTestforListener
{
	
	public void getSS(String screenshot) throws IOException {
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/"+screenshot+".png");
		Files.copy(src, dest);
	}
}
