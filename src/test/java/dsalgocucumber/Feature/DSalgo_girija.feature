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