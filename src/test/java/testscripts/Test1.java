package testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import global.Base;
import pageobject.LandingPage;
import pageobject.LandingPage1;
import pageobject.Loginpage;

public class Test1 extends Base{
	
	
	@BeforeTest
	public void initilaize() throws IOException
	{
		driver=initilaizeDriver();

	}
	
	@Test(dataProvider="getData")
	public void method1(String username, String password) throws IOException
	{
		driver.get(p.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getSignin().click();
		
		LandingPage1 lp1 = new LandingPage1(driver);
		lp1.getEmailLogin().click();
		
		Loginpage lp2 = new Loginpage(driver);
		if(username.equalsIgnoreCase("bhaskarchadaram369@gmail.com"))
		{
			lp2.getEmail().sendKeys(username);
		}
		if(password.equals("Aha@1234"))
		{
			lp2.getPassword().sendKeys(password);
		}
		
		
		lp2.getLogin().click();
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] obj = new Object[3][2];
		obj[0][0] = "bharat";
		obj[0][1] ="bharat";
		obj[1][0] = "chandhini";
		obj[1][1] ="chandhini";
		obj[2][0] = "bhaskarchadaram369@gmail.com";
		obj[2][1] ="Aha@1234";
		return obj;
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
