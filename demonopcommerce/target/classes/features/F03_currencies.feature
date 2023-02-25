@smoke
  Feature: F03_currencies | Users could change the currencies

    Scenario: user could choose the currencies
      Given user select currency list
      When user select Euro currency
      Then user change the currencies successfully
