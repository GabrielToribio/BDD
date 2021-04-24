@Login @Regression
Feature: Validate PHP Travels Login functionality 

Background: 
	Given User is on the PHP login page
	
@Scenario1 @Smoke
Scenario: User should be able to login with valid credentials 
	When User enters username as "admin@phptravels.com"
	When User enters password as "demoadmin"
	And User clicks on Login button 
	Then User should land on Dashboard page
	
@Scenario2
Scenario: User should be able to login with valid credentials 
	When User enters username from database
	When User enters password from database
	And User clicks on Login button 
	Then User should land on Dashboard page