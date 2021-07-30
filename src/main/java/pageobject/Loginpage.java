package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath ="//input[@type='email']") WebElement username;
	@FindBy(xpath="//input[@type='password']") WebElement password;
	@FindBy(xpath ="//input[@type='submit']") WebElement login;
	
	public WebElement getEmail()
	{
		return username;
	}
	public WebElement getPassword()
	{
		return password;
	}
	public WebElement getLogin()
	{
		return login;
	}
	

}
