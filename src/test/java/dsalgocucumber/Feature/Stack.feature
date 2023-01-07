Feature: Validate different functions in Stack

  Scenario: Validate get started function for stack
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under stack
    Then user should be in stack page

  Scenario: Validate "operations in stack" link
    When user clicks on the link "Operations in Stack"
    Then user should be redirected to "Operations in Stack" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Stack") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Applications" link
    When user clicks on the link "Applications"
    Then user should be redirected to "Applications" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Stack") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Vaidate "implimentation" link
    When user clicks on the link "Implementation"
    Then user should be redirected to "Implementation" page
    And user should be able to see "Try here" button
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello Stack") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Practice Questions" link
    When user clicks Practice Questions
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back to home page
