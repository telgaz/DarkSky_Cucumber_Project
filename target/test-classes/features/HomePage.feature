@homepage
Feature: Darksky page feature

  Background:
    Given I am on darsky homepage
  @darksky
  Scenario: Verify lowest and highest degrees of today on darksky page
    When I click on today button on home page
    And I verify lowest temperature of the day on home page
    Then I verify highest temperature on darksky home page