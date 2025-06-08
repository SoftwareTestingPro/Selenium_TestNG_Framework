package com.qa.Selenium.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LaunchFirefoxBrowser {

	@Test
	public void launchFirefoxBrowser() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://softwaretestingpro.github.io/index.html");
		driver.quit();
	}
}