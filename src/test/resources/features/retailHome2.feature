Feature: Register new user


@RegisterTest
Scenario: Create new user account in Test Environment
	Given user is on Retail website
	When user click on Myaccount
	And user click on Register
	And user fill registeration form with below information
	|firstName|lastName|email|telephone|password|passwordConfirm|subscribe|
	|alex     |ahmad   |alexahmad@gmail.com|2012342221|WrongPass|WrongPass|yes|
	And user agree to privacy and policy
	And user click on continue button
	Then user should see successful message 'Your Account Has Been Created!'
