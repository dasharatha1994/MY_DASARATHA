package StepsForHooks;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksDemoSteps {
	WebDriver driver = null;

	@Before("@smoke")
	public void browserSetup() {
		System.out.println(" i am inside browserSetup");
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// driver.manage().window().maximize();

	}
	@Before("@regression")
	public void setup2() {
		System.out.println(" i am inside setup2 \n");
	}
	@After(order=1)
	public void teardown() {
		System.out.println(" i am inside teardown");
		driver.close();
		//driver.quit();
	}
	@After(order=2)
	public void teardown2() {
		System.out.println(" i am inside teardown2 \n");
		
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println(" i am inside beforeSteps");
	}

	@AfterStep
	public void afterSteps() {
		System.out.println(" i am inside afterSteps");
	}

	@Given("user is on login page")
	public void user_is_on_login_page() {
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
	}

}
