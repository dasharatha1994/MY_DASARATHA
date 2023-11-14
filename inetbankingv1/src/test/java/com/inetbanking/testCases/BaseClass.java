package com.inetbanking.testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig=new ReadConfig();
	
	public String baseURL=readconfig.getApplicationURL();
	public String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	
	@Parameters("browser")   //take parameter from xml file
	@BeforeClass
	public void setup(String br)
	{
		
	    logger=Logger.getLogger("socialmediaApps");
	    PropertyConfigurator.configure("Log4j.properties");
	  /*  if(br.equals("chrome"))
	    {*/
	    System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
	    driver=new ChromeDriver();
	   /* }
	    else if(br.equals("firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
		    driver=new FirefoxDriver();	
	    }*/
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get(baseURL);

	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
