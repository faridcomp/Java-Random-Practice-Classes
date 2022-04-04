Feature: Login to Retail Website

@smokeTest
Scenario: Retail website Login test
Given user is on Retail website
When user click on Myaccount
And user click on Login option
And user enter userName 'jamesme22@tekschoo.us' and password 'James2334400'
And user click on login Button
Then user should be logged in to Myaccount dashboard


Scenario Outline: Retail website Login test with multiple accounts
Given user is on Retail website
When user click on Myaccount
And user click on Login option
And user enter userName '<userName>' and password '<password>'
And user clik on Login Button
Then user should be logged in to Myaccount dashboard

Examples:
|userName|password|
