Feature: Login functionality

  Scenario: Successful login
    Given I am on the login page
    When I enter correct username and password
    And I click on login button
    Then I should be logged in

  Scenario: Blocked user login
    Given I am on the login page
    When I enter username and password for blocked user
    And I click on login button
    Then I should see an error