package com.zoo.cli;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BlankSeleniumTest {

	String baseurl = "http://www.thetestroom.com/webapp/";
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is the before test method of the blank test");
		driver = new FirefoxDriver();
		driver.navigate().to(baseurl);
	}

	@Test
	public void ActualBlankSeleniumTest() {

		String pageName = driver.getTitle();
		System.out.println("The actual title of the page is: " + pageName);
		Assert.assertEquals(pageName, "Zoo Adoption | Home");
		Reporter.getCurrentTestResult();

	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is the After test method of the blank test");
	}

}
