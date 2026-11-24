package com.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement loginButton;
	
	
	@FindBy(xpath="//button[@class='error-button']")
	WebElement errorMessage;
	
	
	public void verifyLogin(String user,String pass)
	{
		username.sendKeys(user);
		password.sendKeys(pass);
		loginButton.click();
	}
	
	public String expectedMessage()
	{
		return errorMessage.getText();
	}

}
