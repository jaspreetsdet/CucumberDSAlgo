Feature: feature to test homepage 

Background: User sign in 
	Given User Opens Url in Browser 
	When User is clicks on getstart button 
	Then User clicks on signin link 
	And User login with valid Credentials 
	
Scenario: User opens Graph 
	Given User clicks on graph Getstart button 
	Then User Opens other Graphsublinks 
	And User quits Browser 
	
Scenario: User opens Tree 
	Given User Clicks on tree Getstart button 
	Then User verifies all the Tree links 
	And User quits Browser 
	
Scenario: User opens Linkedlist 
	Given User Clicks on LinkedList Getstart button 
	Then User verifies all the Linked_list links 
	And User quits Browser 
	
Scenario: text editor validation 
	Given User Clicks on tree Getstart button 
	And print the error message 
	And User quits Browser 
	
	
Scenario: Portal 
	Given The user enter url "https://dsportalapp.herokuapp.com/" 
	When The user should land in DS Algo portal page 
	When The user clicks the "Get Started" button 
	Then The user should be in homepage 
	Then The user should see 6 panels with different data structures 
	When The user clicks "Data Structures" drop down 
	Then The user should see 6 different data structure entries in that dropdown 
	When The user clicks any of the "Get Started" buttons below the data structures 
	Then It should alert the user with a message "You are not logged in" 
	When The user selects any data structures item from the drop down without Sign in 
	Then It should alert the user with a message "You are not logged in" 
	When The user clicks "Register" 
	Then The user should be in Register form 
    