package com.MavenTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void failThis() {
		Assert.assertEquals(12, 12);
	}
}
