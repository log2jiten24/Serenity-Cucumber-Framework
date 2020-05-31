Feature: Login To HRM and Newtours demopage 

  @OrangeHRM
	Scenario: Login with valid credentials
	Given user is on home page
	When user enter admin as username
	And  user enter admin123 as password
	Then user should be able to login 
	
	
 @Newtoursdemo
 Scenario: To login and verify the user booking of the newtours demo 

 Given User is on Home page 
 When  User Enters 'log2jeet24@gmail.com' and 'Ajiten#1990'
 And   User Selects Flight type 
 And   User Select Passenger
 And   User Clicks on the Continue Button 
 Then  User Sign Off from the Home Page 