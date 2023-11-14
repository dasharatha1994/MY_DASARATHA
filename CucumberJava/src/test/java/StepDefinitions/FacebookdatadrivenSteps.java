package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookdatadrivenSteps {

	/*WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step-browser is open");
		String projectPath=System.getProperty("user.dir");
		System.out.println("Project path is:"+projectPath);
		System.setProperty("webdriver.chrome.driver",projectPath+"//src//test//resources//drivers//chromedriver.exe");
	
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.facebook.com");
	    
	}

	@When("^user enters (.*)and(.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys(username);
		  Thread.sleep(4000);
		driver.findElement(By.id("pass")).sendKeys("password);
		  Thread.sleep(4000);


	}
	@And("user click on login")
	public void user_click_on_login() throws InterruptedException {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		  Thread.sleep(4000);

	}

	@Then("user is navigate to the home page")
	public void user_is_navigate_to_the_home_page() throws InterruptedException {
		driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Your profile']")).click();
		  Thread.sleep(4000);

		 driver.findElement(By.xpath("//span[contains(text(),'Log Out')]")).click();
		 driver.close();
	   
	}
}*/
