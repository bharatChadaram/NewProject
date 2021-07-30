package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage1 {
	

	public WebDriver driver;
	
	public LandingPage1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[@class='site-border-color login-email-password']") WebElement loginwithemail;
	
	public WebElement getEmailLogin()
	{
		return loginwithemail;
	}

}
