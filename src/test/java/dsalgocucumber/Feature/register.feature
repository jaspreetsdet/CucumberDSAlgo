Feature: register


Scenario: Validate on register page 
Given The user opens Register Page
When The user enters correct credentials
Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"

#
#Scenario: validate on register page enter username displays eror message
#Given The user opens Register Page
#When The user clicks Register button after entering Username with other fields empty
#Then It should display an error "Please fill out this field" below Password textbox
#
#
#
#Scenario: validate on register page after entering usernamepassword display error message
#Given The user opens Register Page
#When The user clicks Register button after entering Username and password with Password Confirmation field empty
#Then It should display an error "Please fill out this field" below Password Confirmation textbox


#Scenario: Validate on register page enter characcters displays error message
#Given The user opens Register Page
#When The user enters a name with characters other than Letters, digits and @/./+/-/_
#Then It should display an error message "Please enter a valid username"
#
#
#
#Scenario: Validate on register page after entering password displays password mismatch error message
#Given The user opens Register Page
#When The user clicks Register button after entering different passwords in Password and Password Confirmation fields 
#Then It should display an error message "password_mismatch:The two password fields didn’t match."
#
#
#Scenario: validate on register page enters password display error message
#Given The user opens Register Page
#When The user enters a Password with characters less than 8
#Then It should display an error message "Password should contain atleast 8 characters"
#
#
#
#Scenario: validate on register page enters password with numbers only  display error message
#Given The user opens Register Page
#
#When The user enters a Password with only numbers
#
#
#Then display error message
#
#
#
#Scenario: validate on register page enters password with numbers only  display error message
#Given The user opens Register Page
#
#When The user opens Register Page
#
#
#Then The user should be redirected to Homepage with the message "New Account Created. You are logged in as <username>"
#
#




