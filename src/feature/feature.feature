Feature: Test Website login scenario

	Scenario: Website login with valid credentials
	Given Open browser and start application
	When I enter valid username and valid password
	Then User should be able to login successfully
	
