@smoke
  Feature:  F05_hoverCategories | user could move between categories

    Scenario: user could choose from categories
      Given user go to homepage
      When user hover on a category
      And user select from sub categories
      Then user go to sub category page