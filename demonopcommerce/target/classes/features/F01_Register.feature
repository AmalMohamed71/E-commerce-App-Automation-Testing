@smoke
Feature:  F01_Register | users could register with new accounts

  Scenario:  guest user could register with valid data successfully
    Given user go to register page
    When user select gender type
    And user enter firstname "automation" and lastname "taster"
    And user select date of birth
    And user enter email
    And user enter password "P@ssw0rd" and confirm "P@ssw0rd"
    And user click on register button
    Then success message is displayed
