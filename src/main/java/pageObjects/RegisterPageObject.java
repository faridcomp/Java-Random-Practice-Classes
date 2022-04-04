package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RegisterPageObject extends Base{
	public RegisterPageObject () {
	
		PageFactory.initElements (driver, this); 
	}
		@FindBy(linkText = "Register")
		private WebElement register; 
		
		@FindBy(xpath = "//input[@name='firstname']")
		private WebElement firstname; 
		
		@FindBy (xpath = "//input[@name='lastname']")
		private WebElement lastname; 
		
		@FindBy (xpath = "//input[@name='email']")
		private WebElement email; 
		
		@FindBy (xpath = "//input[@name='telephone']")
		private WebElement telephone; 
		
		@FindBy (xpath = "//input[@name='password']")
		private WebElement password; 
		
		@FindBy (xpath = "//input[@name='confirm']")
		private WebElement confirmPassword; 
		
		@FindBy (xpath = "//input[@type='radio' and @value='1' and @name='newsletter']")
		private WebElement yesSubscribeButton; 
		
		@FindBy (xpath = "//input[@name='newsletter' and @checked = 'checked']")
		private WebElement noSubscribeButton; 
		
		@FindBy (xpath = "//input[@name='agree']")
		private WebElement privacyPolicy; 
		
		@FindBy (xpath = "//input[@type='submit']")
		private WebElement continueButton; 
		
		@FindBy (xpath = "//h1[text()='Your Account Has Been Created!']")
		private WebElement successMessage; 
		
		public void clickOnRegister () {
			register.click();
		}
		
		public void enterFirstName (String fName) {
			firstname.sendKeys(fName);
		}
		
		public void enterLastName (String lName) {
			lastname.sendKeys(lName);
		}
		
		public void enterEmail (String e_mail) {
			email.sendKeys(e_mail);
		}
		
		public void enterPhone (String phoneValue) {
			telephone.sendKeys(phoneValue); 
		}
		
		public void enterPassword (String passwordValue) {
			password.sendKeys(passwordValue);
		}
		
		public void enterConfirmPassword (String confirmPassValue) {
			confirmPassword.sendKeys(confirmPassValue); 
		}
		
		public void subscription (String value) {
			if(value.equalsIgnoreCase("yes") && !yesSubscribeButton.isSelected())
				yesSubscribeButton.click();
			else if (
				value.equalsIgnoreCase("no") && !noSubscribeButton.isSelected())
				noSubscribeButton.click();
			
		}
		public void clickOnPrivacyPolicy() {
			if(privacyPolicy.isDisplayed())
			privacyPolicy.click();
		}
		
		public void clickOnContinueButton() {
			continueButton.click(); 
		}
		
		public String getSuccessMessage () {
			return successMessage.getText(); 
		}
		
	}

