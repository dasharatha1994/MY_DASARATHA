Feature: login functionality test

  Scenario: Check login with credentials
    Given user is on login page
    When user enters valid username and password
    And click on login button
    Then user is navigated to the home page

  Scenario: Check login with invalid credentials
    Given user is on login page
    When user enters invalid username and password
    And click on login button
    Then error message is displayed - Invalid Credentials
