package com.qa.Selenium.TestNG;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CaptureElementScreenshot {
	@Test
	public void captureElementScreenshot() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com");
		WebElement InputField = driver.findElement(By.xpath("//a/img[@itemprop='logo']"));
		File source = InputField.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/screenshots/Element.png");
		FileHandler.copy(source, dest);
		driver.quit();
	}
}