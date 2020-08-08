Feature: Login Test 
	Description: This feature is to validate login functionality. 

Scenario: Successfull Login with Valid Credentials 
	Given User is on Home Page 
	When User Enter Valid Username and Password 
	Then User Can Click on My Course Link 
	And user Can See List of Courses 
	
	
Scenario: Unsuccessful Login with invalid Credentials 
	Given User is on Home Page 
	When User enters Username and Password 
	And	 Clicks the Sing In button 
	But The	user credentials are wrong 
	Then Message displayed Wrong Username &	Password 
	
	
Scenario: Successful Logout 
	Given User On My Course Page 
	When User click on Logout Link 
	Then User Can See Home Page 
	 
