package com.inetbanking.testData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {

	public static void main(String[] args) throws Throwable {

		WebDriverManager.chromedriver().setup();
	    WebDriver driver=new ChromeDriver();
		
		 WebElement email=driver.findElement(By.id("email"));
		    email.sendKeys("dasharathamallik11@gmail.com");
		    WebElement password=driver.findElement(By.id("pass"));
		    password.sendKeys("Hemanta");
		    
		    WebElement loginBtn=driver.findElement(By.xpath("//button[@type='submit']"));loginBtn.click();
		  
		   Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Your profile']")).click();
		  Thread.sleep(6000);

		 driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		 driver.close();
		
	}

}
