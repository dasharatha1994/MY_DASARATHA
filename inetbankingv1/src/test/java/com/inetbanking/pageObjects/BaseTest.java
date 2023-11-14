package com.inetbanking.pageObjects;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BaseTest {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();

	public static FileReader fr;
	public static FileReader fr1;
	public static Logger logger;
	@Parameters("browser") 
	@BeforeClass
	public void setUp(String br) throws IOException {
		logger=Logger.getLogger("ebanking");
	    PropertyConfigurator.configure("Log4j.properties");
		
		if(driver==null) {
		} fr=new FileReader("C:\\Users\\hp\\eclipse-workspace\\HybridFramework\\inetbankingv1\\Configuration\\config1.properties");
	 fr1=new FileReader("C:\\Users\\hp\\eclipse-workspace\\HybridFramework\\inetbankingv1\\Configuration\\locators.properties");

		prop.load(fr);
		loc.load(fr1);

	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     driver.get(prop.getProperty("baseURL"));
	}
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
	     driver.get(prop.getProperty("baseURL"));

	}
	}
	@AfterClass
	public void tearDown() {
		driver.quit();

		
	}

}
