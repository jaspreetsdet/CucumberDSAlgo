Feature: Queue testing feature 


Scenario: Validate Queue Page
Given The user is in the Queue page after logged in	
When The user clicks Implementation of Queue in Python button	
Then The user should be directed to Implementation of Queue in Python Page



Scenario: validate user redirected to page having tryeditor with run button
Given  The user is in the Implementation of Queue in Pythonpage after logged in
When   The user clicks "Try Here" button 
Then  The user should be redirected to a page having an tryEditor with a Run button to test



Scenario: validate user directed to implementation using collections
Given The user is in the Queue page after logged in
When The user clicks "Implementation using Collections deque" button 
Then The user should be directed to "Implementation using Collections deque" Page


 Scenario: The user should be redireceted to page haaving tryeitor with run button
Given The user is in the Implementation using Collections deque page after logged in
When  The user clicks "Try Here" button
Then   The user should be redirected to a page having an tryEditor with a Run button to test



Scenario: validate user directed to implementation using Arraypage
Given  The user is in the Queue page after logged in
When The user clicks "Implementation using Arrays" button
Then  The user should be directed to "Implementation using Array" Page




Scenario: The user should be redirected to tryeditor with run button
Given The user is in the Implementation using Array page after logged in
When  The user clicks "Try Here" button
Then  The user should be redirected to a page having an tryEditor with a Run button to test


Scenario: Validate Queue Operations page
Given The user is in the Queue page after logged in	
When The user clicks "Queue Operations" button	
Then The user should be directed to "Queue Operations" Page


Scenario: validate user directed to tryeditor with runbutton
Given   The user is in the Queue Operations page after logged in
When The user clicks "Try Here" button
Then The user should be redirected to a page having an tryEditor with a Run button to test



Scenario: user should be directed to Practice page 
	Given  The user is in the Queue page after logged in 
	When  The user clicks "Practice Questions" button 
	Then      The user should be redirected to "Practice" page 
	
	
