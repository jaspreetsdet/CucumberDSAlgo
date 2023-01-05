Feature: Register

  Scenario Outline: Registration Validation
    Given The user opens browser and enter url "https://dsportalapp.herokuapp.com/register"
    When user type username as <username>
    And type password as <password>
    And confirmpassword as <confirmpassword>
    And user click on register button
    Then user should be able to see message "password_mismatch:The two password fields didn’t match."
    When user clicks on login instead link
    Then user should be redirected to login page

    Examples: 
      | username  | password    | confirmpassword | status |
      | Tom Jerry | tomjerry@22 | tomjerry22      | fail   |
      | Sreeja    | tomjerry@22 | tomjerry@22     | pass   |
