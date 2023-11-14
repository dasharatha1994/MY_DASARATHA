package seleniumwebdriverbasictests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
     
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse\\java-2022-122\\eclipse\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.manage().window().maximize();
   // driver.findElement(By.name("emailaddress")).sendKeys("dasharathamallik11@gmail.com");
   
    
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
