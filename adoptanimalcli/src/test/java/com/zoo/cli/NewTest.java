package com.zoo.cli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {

	WebDriver driver;
	String baseurl;

	@BeforeTest
	public void beforeTest() {
		driver = new FirefoxDriver();
		baseurl = "http://www.thetestroom.com/webapp/index.html";
	}

	@Test
	public void contactPageTest() {

		driver.navigate().to(baseurl);
		driver.findElement(By.id("contact_link")).click();
		driver.findElement(By.name("name_field")).sendKeys("Philip");
		driver.findElement(By.name("address_field")).sendKeys(
				"123 Billing st Melbourne");
		driver.findElement(By.name("postcode_field")).sendKeys("3000");
		driver.findElement(By.name("email_field")).sendKeys(
				"philip@thisplace.com");
		driver.findElement(By.id("submit_message")).click();
		String pagetitle = driver.getTitle();
		System.out.println("The page title is: " + pagetitle);
		Assert.assertEquals(pagetitle, "Contact Confirmationxx");
	}

	@AfterTest
	public void afterTest() {
	}

}
