Feature: Validate signout function
Scenario: Logout Validation
    Given user should be in homepage logged in url "https://dsportalapp.herokuapp.com/home"
    When user clicks on "Sign out"
    Then user should be able to see "Logged out successfully"
