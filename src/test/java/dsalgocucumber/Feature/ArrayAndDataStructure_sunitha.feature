Feature: Arrays and DataStructures

Background: PortalPage
Given The user opens DS Algo portal link
When The User enter the url "https://dsportalapp.herokuapp.com/"
When The User clicks "Get Started" button
And User clicks Signin button
And User enters username as "sunitha2" and password as "abcd2011"
And clicks "login" button
Then The user should successfully logged in to the HomePage


Scenario: Validate "ArrayLinks" link 
When The User clicks the "GetStarted" button On Arrays 
Then The user should be redirected to Arrays Page 
When The user clicking "Arrays In Python" link
Then The user should be redirected to "Arrays in Python" page 
When The User clicks Try Here button 
Then The user should be redirected to tryEditor page
And The User should navigated back to Arrays In Python Page
When The User click on "Practice Questions" button
Then The user should be redirected to "Practice questions" page
When user clicks on the "Search the array" link
Then The user should be redirected to "Quetions" page
And The User should navigated back toPractice questions page
When user clicks on the "Max Consecutive Ones" link
Then The user should be redirected to "Quetions" page
And The User should navigated back toPractice questions page
When user clicks on the "Find Numbers with Even Number" link
Then The user should be redirected to "Quetions" page
And The User should navigated back toPractice questions page
When user clicks on the "Squares of Sorted Array" link
Then The user should be redirected to "Quetions" page
And The User should navigated back toPractice questions page
And The User should navigated back to Array Page
When The user clicking "Arrays Using List" link 
Then The user should be redirected to "Arrays Using List" page
When The User clicks Try Here button 
Then The user should be redirected to tryEditor page
And The User should navigated back to Arrays In Python Page
And The User should navigated back to Array Page
When The user clicking "Basic Operations inn List" link 
Then The user should be redirected to "Basic Operations in List" page
When The User clicks Try Here button 
Then The user should be redirected to tryEditor page
And The User should navigated back to Arrays In Python Page
And The User should navigated back to Array Page
When The user clicking "Applications Of Arrays" link
Then The user should be redirected to "Applications of Array" page
When The User clicks Try Here button 
Then The user should be redirected to tryEditor page
And The User should navigated back to Arrays In Python Page
And The User should navigated back to Array Page
And The User "Sign out"


Scenario: Validate "DataStructure" link
When The User clicks the "GetStarted" On DataStructures
Then  The user should be redirected to "Datastructures" page
When The user clicks on "Time Compexity" link
Then The user should navigated to "Time Compexity" Page
When The user clicks the Try Here button
Then The user should navigated to tryditor page
And The user navigated back to Time Compexity page
When The user clicks on the "Practice Questions" link
Then The user should navigated to practice page
And The user should see the title "Questions for Practice"
And The user navigated back to Time Compexity page
And The user navigated to Data Structure page
And The User "Sign out"

