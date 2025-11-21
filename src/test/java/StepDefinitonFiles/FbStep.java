package StepDefinitonFiles;

import org.testng.Assert;

import BaseLayer.BaseClass;
import PageLayer.RegistrationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FbStep extends BaseClass{

	static RegistrationPage rp;
	@Given("user should be on registration page")
	public void user_should_be_on_registration_page() {
	    BaseClass.initilization(); 
		
	    Assert.assertEquals(true, driver.getCurrentUrl().contains("facebook"));
	}

	@When("user should enter firstname as {string} and sirname as {string}")
	public void user_should_enter_firstname_as_and_sirname_as(String fname, String lname) {
	     
	     rp= new RegistrationPage();
	    rp.registrationFunctionality(fname, lname);
	}

	@When("user should enter date as {string} and month as {string} and year as {string}")
	public void user_should_enter_date_as_and_month_as_and_year_as(String Date, String Month, String Year) {
	     
	   rp.dobFunctionality(Date, Month, Year);
	}

	@When("user should enter gender as {string}")
	public void user_should_enter_gender_as(String Gender) {
	     
	   rp.genderFunctioanlity(Gender);
	}

	@When("user should enter email as {string} and password as {string}")
	public void user_should_enter_email_as_and_password_as(String Email, String Passw) {
	     
	   rp.emailAndPassFunctioanlity(Email, Passw);
	}

	@Then("user should click on signup button")
	public void user_should_click_on_signup_button() {
	     
	 rp.signUpFunctioanlity();   
	}
}
