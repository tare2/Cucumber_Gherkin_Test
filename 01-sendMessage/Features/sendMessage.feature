Feature: Sending message

Scenario Outline:: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://accounts.google.com/signin"
	And User enters Email as "<emailLogin>" 
	And Click on Next
	And User enters Password as "<PasswordLogin>"
	And Click on login
	Then User is logged in
	When User click on Compose
	And User sends email to "<sendEmailto>" 
	And User writes email subject "<emailSubject>"
	And User writes content "<emailMessage>"
	And User click on Send
	Then sending message process is completed
	And close browser
	
	Examples: 
	|     emailLogin     |     passwordLogin     |     sendEmailTo     |      emailSubject      |            emailMessage             |
	| Salvador@gmail.com |       7jkol@gg        |  drakola@blood.com  |      GarlicPoison      |  blab bla bla bla bla blaa blaaa    |
	| Bugatti@hotmail.com|     km_+)))$#%ngt     |   dodge@vroom.com   |     V12 Motor Info     | what is the top speed for the demon |
	|  patrof@yahoo.com  |     llAnu76UJBUTY     |   wolfs@awuuoo.com  |      emailSubject      |Is there any courses for making awuoo|