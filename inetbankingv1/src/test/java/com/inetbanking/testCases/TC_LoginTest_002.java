package com.inetbanking.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.BaseTest;
import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.ReadXLSdata;

import junit.framework.Assert;

public class TC_LoginTest_002 extends BaseTest{
	
	@Test(dataProviderClass=ReadXLSdata.class,dataProvider="bttdata")
	public static void LoginTest2(String username, String password) throws InterruptedException {
		
		logger.info("URL is opened");
		LoginPage lp=new LoginPage(driver);
		lp.SetUserName(username);
		logger.info("Enter username");

		lp.SetPassword(password);
		logger.info("Enter password");
		lp.clickSubmit();
		
		System.out.println("Clicked successfully");
		driver.findElement(By.id(loc.getProperty("email_field"))).sendKeys(username);
		Thread.sleep(5000);
		driver.findElement(By.id(loc.getProperty("pwd_field"))).sendKeys(password);
		Thread.sleep(6000);
		driver.findElement(By.xpath(loc.getProperty("loginBtn"))).click();
		Thread.sleep(5000);
		
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

	private static void captureScreen(WebDriver driver, String string) {
		// TODO Auto-generated method stub
		
	}
}
