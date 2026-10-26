Feature: Data table practice
Scenario: Data table practice without header
Given I am launching URL "https://www.facebook.com/login/"
	When I am entering below userName and passWord:
	| UserName          | PassWord  |
	| vin0123@gmail.com | Eras@2020 |
	| vin0223@gmail.com | Eras@2020 |
	And I am clicking login button
	Then I am validating sucessfully logedin or not 
