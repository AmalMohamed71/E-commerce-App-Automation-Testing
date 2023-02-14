@smoke
  Feature: F04_Search | users could search for products

    Scenario:  user could search using product name
      Given user go to home-page
      When user enter product name "Apple"
      And search results list appear
      And user click on search-button
      Then result page load successfully




    Scenario: user could search for product using sku
      Given user go to home_page
      When user select search_bar
      And user enter  serial number of the product
      And user click on search_button