package stepDefinitions;




import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import global.Base;
//import cucumber.api.junit.Cucumber;
import pageobject.LandingPage;
import pageobject.LandingPage1;
import pageobject.Loginpage;

@RunWith(Cucumber.class)
public class StepDefinitions extends Base{

	@Given("^I am at Landingpage$")
	public void i_am_at_Landingpage() throws Throwable {
		driver=initilaizeDriver();
	}
	@Given("^click \"([^\"]*)\"$")
	public void click(String arg1) throws Throwable {
		driver.get(arg1);
		
		
		
	}

	 @When("^user login into application with  (.+) and  (.+)$")
	    public void user_login_into_application_with_and(String username, String password) throws Throwable {
		 LandingPage lp = new LandingPage(driver);

	        lp.getSignin().click();
			LandingPage1 lp1 = new LandingPage1(driver);
			lp1.getEmailLogin().click();
			
			Loginpage lp2 = new Loginpage(driver);
			lp2.getEmail().sendKeys(username);
			lp2.getPassword().sendKeys(password);
			lp2.getLogin().click();
	    }

	
	 

	@Then("^Homepage should be displayed$")
	public void homepage_should_be_displayed() throws Throwable {
		   System.out.println("Home page displayed");

	}
	@And("^close Browsers$")
    public void close_browsers() throws Throwable {
		driver.close();
		driver.quit();
    }

	



}