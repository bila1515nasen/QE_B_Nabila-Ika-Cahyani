#noinspection CucumberUndefinedStep
Feature: Post
  As a user
  I want  to start a post
  So that i can update my post

  Scenario: As user i have be able to success post
    Given I am on the home page
    When I create a post
    And I click post button
    Then I am finish my post

