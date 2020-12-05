Feature: Free CRM Login Feature

#Scenario: Free CRM Login Test Scenario
 # Given user is already on Login Page
 # When title of login page is Free CRM
 # Then user enters " prashanthirave86@gmail.com" and "P9096960753"
 # Then user click on Login 
 # Then user is on home page
  

    
    #with Examples Keyword
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
Then user enters "<email>" and "<password>"
Then user click on Login 
Then user is on home page
Then Close the browser



Examples:
| email| password |
| prashanthirave86@gmail.com  | P9096960753 |
| vickyhirave86@gmail..com    | V1234567890  | 	
		