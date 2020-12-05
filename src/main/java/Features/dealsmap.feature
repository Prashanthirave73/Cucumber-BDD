Feature: Deal data creation 

Scenario: Free CRM Create a new deal scenario 

	Given user is already on Login Page 
	When title of login page is Free CRM 
	Then user enters email and password 
		| email | password|
		| prashanthirave86@gmail.com | P9096960753 |
		
	Then user click on Login 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters the deal details 
		|title       | probability | amount | commission |
		| test deal1 | 50 | 1000 | 10 |
		| test deal2 | 60 | 2000 | 20 |
		| test deal3 | 70 | 3000 | 30 |
		
	Then Close the browser