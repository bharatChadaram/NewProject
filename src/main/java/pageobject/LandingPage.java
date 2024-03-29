package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//button[@class='login-button navigation-link  ']") WebElement signin;
	@FindBy(xpath="//div[text()='aha Originals']") WebElement text;
	
	
	
	public WebElement getSignin()
	{
		return signin;
	}
	public WebElement getTitle()
	{
		return text;
	}
}
