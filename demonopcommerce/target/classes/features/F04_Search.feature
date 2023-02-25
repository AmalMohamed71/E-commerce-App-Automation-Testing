@smoke
  Feature: F04_Search | users could search for products

    Scenario:  user could search using product name
      Given user go to home-page
      When user enter product <name> "laptop"
      And user click on search-button
      Then result page load successfully

    Scenario Outline: user could search using product name
      Examples:
        name
        laptop
        book
        nike


    Scenario: user could search for product using sku
      Given user go to home_page
      When user enter product <SKU> "AP_MBP_13"
      And user click on the product in search result
      Then result-page load successfully

    Scenario Outline: user could search using product name
      Examples:
        sku
      AP_MBP_13
      SF_PRO_11
      APPLE_CAM