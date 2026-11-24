package com.selenium.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.selenium.driver.DriverFactory;

public class BaseTest 
{
	@BeforeMethod
	public void setup()
	{
		DriverFactory.initDriver();
		DriverFactory.getDriver().get("https://www.saucedemo.com/");
	}

	
	@AfterMethod
	public void tearDown()
	{
		DriverFactory.quitDriver();
	}
	

}
