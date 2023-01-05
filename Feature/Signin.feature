Feature: Login feature validation

  Scenario Outline: Login with invalid credentials
    Given The user opens browser and enter url "https://dsportalapp.herokuapp.com/login"
    When the user enter username as <username>
    And password as <password>
    And click on login button
    Then It should display an error "Invalid Username and Password"

    Examples: 
      | username | password    | status |
      | sree     | tomjerry@22 | fail   |
      | Sreeja   | tomjerry22  | fail   |

  

  Scenario: Login with valid credentials
    When the user enter username as
      | Sreeja |
    And password as
      | tomjerry@22 |
    And click on login button
    Then the user should be able to see "You are logged in" and username on the top righthand side
