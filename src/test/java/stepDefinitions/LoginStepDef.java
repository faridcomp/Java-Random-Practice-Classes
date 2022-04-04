package stepDefinitions;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPageObject;
import utilities.UtilityClass;

public class LoginStepDef extends Base {
	LoginPageObject loginPageObject = new LoginPageObject();

	@Given("^user is on Retail website$")
	public void user_is_on_Retail_website() {
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "TEK SCHOOL";
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
		Logger.info("Actual title is matchting with the expected Title.");
		UtilityClass.takeScreenShot();

	}

	@When("^user click on Myaccount$")
	public void user_click_on_Myaccount() {
		loginPageObject.clickOnMyAccount();
		Logger.info("user clicked on MyAccount");
		UtilityClass.takeScreenShot();

	}

	@And("^user click on Login option$")
	public void user_click_on_Login_option() {
		loginPageObject.clickOnLogin();
		Logger.info("user clicked on MyAccount");
	}

	@And("^user enter userName '(.+)' and password '(.+)'$")
	public void user_enter_userName_and_password(String uName, String pass) {
		loginPageObject.enterEmailAndPassword(uName, pass);
		Logger.info("user entered " + uName + " and password" + pass);
		UtilityClass.takeScreenShot();
	}

	@And("^user click on login Button$")
	public void user_click_on_login_Button() {
		loginPageObject.clickOnLoginButton();
		Logger.info("user clicked on MyAccount");
	}

	@Then("^user should be logged in to Myaccount dashboard$")
	public void user_should_be_logged_in_to_Myaccount_dashboard() {
		Assert.assertTrue(loginPageObject.myAccountTextisPresent());
		Logger.info("user logged in to on MyAccount Dashboard");
		UtilityClass.takeScreenShot();

	}
}
