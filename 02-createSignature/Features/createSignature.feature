Feature: Create Signature

Scenario Outline:: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://accounts.google.com/signin"
	And User enters Email as "<emailLogin>" 
	And Click on Next
	And User enters Password as "<PasswordLogin>"
	And Click on login
	Then User is logged in
	When User click on settings
	And User click on see all settings 
	And User presses on create new signature
	And User writes content "<Signature>"
	And User click on Create
	Then Making signature process is completed
	And close browser
	
	Examples: 
	|     emailLogin     |     passwordLogin     |    Signature    |
	| cheriste@gmail.com |       7jkol@gg        |  Mohamed Tarek  |
	| Sourout@hotmail.com|     km_+)))$#%ngt     |   Cheristialo   |
	|  raoold@yahoo.com  |     llAnu76UJBUTY     |      Shulze     |