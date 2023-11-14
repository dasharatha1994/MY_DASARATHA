package seleniumwebtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MDStest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\eclipse\\java-2022-122\\eclipse\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("https://www.flipkart.com/");
	      driver.manage().window().maximize();
	      driver.findElement(By.xpath("//button[text()='✕']")).click();
		 driver.findElement(By.xpath("//span[text()='Cart']")).click();
		 Thread.sleep(8000);
		 driver.navigate().back();
		 Thread.sleep(8000);

		 driver.findElement(By.linkText("About Us")).click();
		 

	}

}
