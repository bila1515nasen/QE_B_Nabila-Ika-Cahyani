Feature: User
  As an admin
  I want to use list of user
  So that i can create new user

  Scenario: GET- As admin I have be able to get detail user
    Given I set GET api endpoint
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail user