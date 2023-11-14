package seleniumwebdrivertests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartAutoRequestOtp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse\\java-2022-122\\eclipse\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.flipkart.com/account/login");
         WebDriverWait wait=new WebDriverWait(driver, 10);
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='_2IX_2- VJDxU']")));
         WebElement mobileNumber=driver.findElement(By.xpath("//input@class='_2IX_2- VJDxU']"));
          mobileNumber.sendKeys("8658386290");
          WebElement continueButton=driver.findElement(By.xpath("//button[@class='_KpZ6I_2HKIqd_3AWRsL']"));
          continueButton.click();

          until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text()));
	}

}
   