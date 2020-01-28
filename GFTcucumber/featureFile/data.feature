Feature: Login Functionality
@data-driven
Scenario: Login with valid credentials
	Given Navigate to Home Page
	When User enters username and password
	Then User logged in successfully
@data-driven	
Scenario: The one where user picks different products through search functionality 
	When Lalitha searches below products in the search box:
	|Head|
	|Travel|
	
	Then product should be added in the cart if available

@user-specific
 Scenario Outline: Login TEST
	Given Navigate to Home Page
	When User enters <"username"> and <"password">
	Then User logged in successfully
	
	Examples:
	|username	|password	|
	|lalitha	|Password123|
	|lalitha1	|Password1234|