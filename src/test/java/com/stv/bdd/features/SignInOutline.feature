Feature: Sing in page

  Scenario: 1. Load home page
    When Wiggle home page is opened
    And User clicks on "Accept all" button
    Then Wiggle Logo is displayed

  Scenario Outline: 2. Load Sign in page
    Given  Wiggle Logo is displayed
    When User clicks on Sign in link
    Then Please log in is displayed
    When User enters <email>
    And User ent <password>
    And User clicks continue
    Then My account is displayed
    When User clicks on My account link
    Then My account is displayed
    When User Sing out click


    Examples:
      | email                         | password  |
      | "afonna85@gmail.com"          | "Afonna85" |
      | "voranava1.22@gmail.com"      | "0903Afonna85"  |