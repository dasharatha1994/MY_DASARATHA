Feature: Test login Functionality

  Scenario: Check login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And user click on login
    Then user is navigate to the home page
