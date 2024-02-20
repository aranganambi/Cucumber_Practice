Feature: Facebook login
Scenario: User validating with credentials
	Given User launching URL "https://www.facebook.com/login/"
	When User entering username "vino52096@hotmail.com"
	And User entering password "Eras@7871044138"
	And User clicking login button
	Then User validating sucessfully logedin or not
	