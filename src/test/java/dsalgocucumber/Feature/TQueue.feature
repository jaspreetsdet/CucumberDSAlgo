Feature: Validate different functions in Queue

  Scenario: Validate get started function for Queue
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Get started" button under Queue
    Then user should be in "Queue" page

  Scenario: Validate "Implementation of Queue in python" link
    When user clicks on the link "Implementation of Queue in Python"
    Then user should be redirected to "Implementation of Queue in Python" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello implementation list") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Implementation using collections.deque" link
    When user clicks on the link "Implementation using collections.deque"
    Then user should be redirected to "Implementation using collections.deque" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello implementation collections") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Implementation using array" link
    When user clicks on the link "Implementation using array"
    Then user should be redirected to "Implementation using array" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello implementation array") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Queue operations" link
    When user clicks on the link "Queue Operations"
    Then user should be redirected to "Queue Operations" page
    When user clicks on "Try here" button
    Then user should be able to see text box
    When user gives input as pycode
      | print ("Hello implementation Operations") |
    And hit run
    Then user should be able to see that in the output
    And user should be able to navigate back

  Scenario: Validate "Practice Questions" link
    When user clicks on the link "Practice Questions"
    Then user should be redirected to "Practice Questions" page
    And user should be able to navigate back to home page
    
