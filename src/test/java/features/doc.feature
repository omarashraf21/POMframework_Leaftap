Feature: Automate TestLeaf Application

@smoke
Scenario Outline: TC001_Login and Logout

Given Launch chrome browser and load url
And enter username as <username>
And enter password as <password>
When click login button
Then its navigated Homepage
And click the logout button
And close browser

Examples:
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|

@functional
Scenario: TC002_Login and Logout for failure

Given Launch chrome browser and load url
And enter username as emon
And enter password as crmsfa
When click login button
Then its navigated Samepage 
But verify error message 
And close browser

@smoke	 
Scenario Outline: TC003_CreateLead

Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click login button
	And click CRMSFA
	And click leads link
	When click createLead
	
	And enter the company as <company>
	And enter the firstname as <firstname>
	And enter the lastname as <lastname>
	And choose source as Website
	And click the create lead button
	Then its navigated ViewLeadPage 
	And verify the firstname
	And close browser
	
	Examples:
	|company|firstname|lastname|
		#|TCS|Hema|Mali|
		#|ABC|Raj|Kumar|
		#|CBC|Gopi|Jkumar|