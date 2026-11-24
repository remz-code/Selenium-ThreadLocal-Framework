package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.base.BaseTest;
import com.selenium.driver.DriverFactory;
import com.selenium.pages.LoginPage;

public class LoginTest extends BaseTest
{
	//LoginPage lp=new LoginPage(DriverFactory.getDriver());
	@Test
	public void validLogin()
	{
		LoginPage lp=new LoginPage(DriverFactory.getDriver());
		lp.verifyLogin("standard_user","secret_sauce");
		Assert.assertTrue(DriverFactory.getDriver().getCurrentUrl().contains("inventory"));
	}
	
	@Test
    public void InvalidLogin()
   {
		LoginPage lp=new LoginPage(DriverFactory.getDriver());
	    lp.verifyLogin("wronguser","wrongpassword");
	    System.out.println(lp.expectedMessage());
	   // Assert.assertTrue(lp.expectedMessage().contains("Username and password"));
   }
	
	
}
