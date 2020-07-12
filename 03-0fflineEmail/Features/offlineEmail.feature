Feature: Enable offline mail

Scenario: Successful Login with Valid Credentials
	Given User Launch Chrome browser
	When User opens URL "https://accounts.google.com/signin"
	And User enters Email as "mo7amdtare2@gmail.com" 
	And Click on Next
	And User enters Password as "7amok4aaa"
	And Click on login
	Then User is logged in
	When User click on Manage Labels
	And User click on offline choise
	And User presses on Enable offline mail
	And User presses on Keep offline data on my computer
	And User click on Save Changes
	Then offline mail process is completed
	