Feature: Basket page

  Scenario: 1.  Load home page
    When Wiggle home page is opened
    And User clicks on "Accept all" button
    Then Wiggle Logo is displayed
    And Account Link is displayed
    When User clicks on Basket Icon
    Then Basket page is displayed
