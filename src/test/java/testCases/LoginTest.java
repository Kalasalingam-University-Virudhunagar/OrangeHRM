package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;


import pageObjects.LoginPage;
import testBase.BaseClass;

public class LoginTest extends BaseClass {
	
	@Test
	public void verify_login()
	{
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		try
		{
		//Home page
		
		
		//Login page
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.setuserName(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin(); //Login button
		logger.info("clicked on ligin button..");
		
		//My Account Page
		//MyAccountPage macc=new MyAccountPage(driver);
				
		//boolean targetPage=macc.isMyAccountPageExists();
		
		//Assert.assertEquals(targetPage, true,"Login failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		
		logger.info("**** Finished TC_002_LoginTest  ****");
	}

}
