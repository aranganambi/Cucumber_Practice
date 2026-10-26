Feature: Facebook login
Scenario: User validating with credentials
	Given User launching URL "https://www.facebook.com/login/"
	When User entering username "vin0123@gmail.com"
	And User entering password "Eras@2020"
	And User clicking login button
	Then User validating sucessfully logedin or not
	
