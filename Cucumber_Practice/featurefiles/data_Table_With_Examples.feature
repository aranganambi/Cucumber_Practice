Feature: Data table practice
Scenario Outline: Data table practice with header
Given I am going to launching URL "https://www.facebook.com/login/"
	When I am going to entering following credentials "<UserName>" and "<PassWord>"
	And I am going to clicking login button
	Then I am going to validating sucessfully logedin or not 
	
	Examples:
    | UserName              | PassWord  |
	| vin0123@gmail.com     | Eras@2020 |
	| vino520@gmail.com     | Eras@2020 |
	| vino1996@hotmail.com  | Eras@2020 |
