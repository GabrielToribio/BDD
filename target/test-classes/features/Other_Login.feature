@OtherLogin @Regression 
Feature: Validate PHP Travels Login functionality using scenario outline

Background: 
	Given User is on the PHP login page 
	
@OtherScenario1
Scenario Outline: User should be able to login with valid credentials 
	When User enters "<username>" and "<password>" 
	And User clicks on Login button 
	Then User should land on Dashboard page 
	Examples: 
	|username				|password	|
	|admin@phptravels.com	|demoadmin	|

	
@OtherScenario2 @Smoke
Scenario Outline: User should be able to login with valid credentials 
	When User enters "<username>" and "<password>" 
	And User clicks on Login button 
	Then User should land on Dashboard page 
	Examples: 
	|username				|password	|
	|admin@phptravels.com	|demoadmin	|
	|user@phptravels.com	|demoadmin	|
