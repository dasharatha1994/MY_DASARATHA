package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
          
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")
	@CacheLookup
	WebElement btnLogin;
	
	
	
	public void SetUserName(String uname)       //action methods
	{
		txtUserName.sendKeys(uname);
	}
	public void SetPassword(String pwd)
	{
		txtUserName.sendKeys(pwd);
	}
	public void clickSubmit()
	{
		btnLogin.click();
	}
	
}
