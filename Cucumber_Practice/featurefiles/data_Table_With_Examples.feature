Feature: Data table practice
Scenario Outline: Data table practice with header
Given I am going to launching URL "https://www.facebook.com/login/"
	When I am going to entering following credentials "<UserName>" and "<PassWord>"
	And I am going to clicking login button
	Then I am going to validating sucessfully logedin or not 
	
	Examples:
  | UserName              | PassWord        |
	| vino52096@hotmail.com | Eras@7871044138 |
	| vino52096@gmail.com   | Eras@7871044139 |
	| vino52097@gmail.com   | Eras@7871044140 |
	| vino52098@hotmail.com   | Eras@9080068143 |