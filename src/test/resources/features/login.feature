@featureTest
Feature: Login page
  I want to test login page security

  @Scenario1
  Scenario: Register account
    Given the login page
    When I write a name "Johny"


  @Scenario2
  Scenario: Login with only filled username
    Given the login page
    When I write a username "administrator"
    And I write a password "administrator"
    And I click a button login
    And I navigate to charge tportmonetka
    And I write a amount "50"
    And I click a next button
    And I click logout
    Then I see title page which contain "Zaloguj się do Facebooka | Facebook"
