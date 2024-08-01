package com.qa.Selenium.TestNG;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CapturePageScreenshot {
	@Test
	public void capturePageScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com");
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(source, new File(System.getProperty("user.dir") + "/screenshots/Page.png"));
		driver.quit();
	}
}