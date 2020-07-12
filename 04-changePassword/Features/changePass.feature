Feature: Change Password

Scenario Outline:: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://accounts.google.com/signin"
	And User enters Email as "<emailLogin>" 
	And Click on Next
	And User enters Password as "<passwordLogin>"
	And Click on login
	Then User is logged in
	When User click on Manage Labels
	And User click on Accounts and Import
	And User click on Change Password
	And User enters a new password as "<newPassword>"
	And User confirms the new password as "<confirmPassword>"
	And User click on Change Password
	Then offline mail process is completed
	
	Examples: 
	|     emailLogin     |     passwordLogin     |    newPassword    |   confirmPassword   |
	| cheriste@gmail.com |       7jkol@gg        |    78ikiiA@rd     |     78ikiiA@rd      |
	| Sourout@hotmail.com|     km_+)))$#%ngt     |   989uj9jugiv     |     989uj9jugiv     |
	|  raoold@yahoo.com  |     llAnu76UJBUTY     |    plAOkOO80      |      plAOkOO80      |
	
	