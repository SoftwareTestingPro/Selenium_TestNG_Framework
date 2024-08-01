package com.qa.Selenium.TestNG;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class CaptureFullPageScreenshot {
	@Test
	public void captureFullPageScreenshot() throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.microsoft.com");		
		File source = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
	    FileHandler.copy(source, new File(System.getProperty("user.dir") + "/screenshots/FullPage.png"));
		driver.quit();
	}
}