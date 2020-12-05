Feature: Free CRM Create Contacts

Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<email>" and "<password>"
Then user click on Login
Then user is on home page
Then user moves to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then Close the browser


Examples:
	| email| password |firstname | lastname | position |
	| prashanthirave86@gmail.com  | P9096960753 | Shubham | Dhavan | Manager |
	| prashanthirave86@gmail.com   | P9096960753  | Rohit | Jangam | Director | 	
		