Feature: Login
  Scenario: As a user should be a able to login
    Given I am on the login page
    When I enter username and password
    And I click login button
    Then I am logged in successfully
