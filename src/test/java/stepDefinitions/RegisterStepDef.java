package stepDefinitions;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.RegisterPageObject;
import utilities.UtilityClass;

@SuppressWarnings("deprecation")
public class RegisterStepDef extends Base{
	

	RegisterPageObject registerPage = new RegisterPageObject(); 
	
	@When("user click on Register")
	public void user_click_on_register() {
		registerPage.clickOnRegister();
		Logger.info("user clicked on Register");
		UtilityClass.takeScreenShot();
	    
	}
	@When("user fill registeration form with below information")
	public void user_fill_registeration_form_with_below_information(DataTable dataTable) {
	    List<Map<String,String>> info = dataTable.asMaps (String.class, String.class); 
	    registerPage.enterFirstName(info.get(0).get("firstName"));
	    registerPage.enterLastName(info.get(0).get("lastName"));
	    registerPage.enterEmail(info.get(0).get("email"));
	    registerPage.enterPhone(info.get(0).get("telephone"));
	    registerPage.enterPassword(info.get(0).get("password"));
	    registerPage.enterConfirmPassword(info.get(0).get("passwordConfirm"));
	    registerPage.subscription(info.get(0).get("subscribe"));
	    Logger.info("user entered personal information" + info.toString());
		UtilityClass.takeScreenShot();
	  
	}
	@When("user agree to privacy and policy")
	public void user_agree_to_privacy_and_policy() {
		registerPage.clickOnPrivacyPolicy();
		Logger.info("User clicked on Privacy and Policy checkBox");
	  
	}
	@When("user click on continue button")
	public void user_click_on_continue_button() {
		registerPage.clickOnContinueButton();
		Logger.info("User clicked Continue Button");
	   
	}
	@SuppressWarnings("deprecation")
	@Then("user should see successful message {string}")
	public void user_should_see_successful_message(String string) {
		Assert.assertEquals(string, registerPage.getSuccessMessage());
		Logger.info("Account created successfully");
		UtilityClass.takeScreenShot();
	}
}
