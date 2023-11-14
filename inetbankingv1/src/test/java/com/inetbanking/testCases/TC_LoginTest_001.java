package com.inetbanking.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

import junit.framework.Assert;

public class TC_LoginTest_001 extends BaseClass {
    
	@Test
	public void logintest() 
	{
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("Enter username");

		lp.SetPassword(password);
		logger.info("Enter password");
		lp.clickSubmit();
				
	
		if(driver.getTitle().equals("facebook profile home page"))
		{
			Assert.assertTrue(true);
			logger.info("Login test passed");

		}
		else
		{
			captureScreen(driver,"logintest");
			Assert.assertTrue(false);
			logger.info("Login test failed");

		}
	}

	private void captureScreen(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
	
}
