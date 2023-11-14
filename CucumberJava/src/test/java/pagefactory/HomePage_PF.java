package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {
	
	@FindBy(xpath="//*[name()='svg' and @aria-label='Your profile']")
	WebElement Your_profile;
	@FindBy(xpath="//span[contains(text(),'Log Out')]")
	WebElement btn_logout;
	WebDriver driver;
	public HomePage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, LoginPage_PF.class);
		
	}
	public void checkLogOutDisplayed() {
		Your_profile.isDisplayed();
		btn_logout.isDisplayed();
	}

}
