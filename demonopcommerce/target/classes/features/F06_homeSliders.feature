@smoke
  Feature: F06_homeSliders | user could found and select sliders on homepage

    Scenario:  first slider is clickable on home page
      Given user go home page
      When user select first slider
      Then the page of the product load successfully




    Scenario: second slider is clickable on home page
      Given user go homepage
      When user select second slider
      Then page of the product load successfully