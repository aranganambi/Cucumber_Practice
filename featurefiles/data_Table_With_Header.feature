Feature: Data table practice
Scenario: Data table practice without header
Given I am launching URL "https://www.facebook.com/login/"
	When I am entering below userName and passWord:
	| UserName              | PassWord        |
	| vino52096@hotmail.com | Eras@7871044138 |
	| vino52096@gmail.com   | Eras@9080068137 |
	And I am clicking login button
	Then I am validating sucessfully logedin or not 
