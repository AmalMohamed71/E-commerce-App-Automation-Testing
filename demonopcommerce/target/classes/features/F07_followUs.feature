@smoke
  Feature:  F07_followUs | users could open followUs links


    Scenario: user opens facebook link
      Given user go home-page
      And find Follow us links
      When  user opens facebook link
      Then facebook is opened in new tab


    Scenario:  user opens twitter link
      Given go home page
      And find Follow-us links
      When  user opens twitter link
      Then twitter is opened in new tab


    Scenario:  user opens rss link
      Given go to home page
      And find Follow_us links
      When user opens rss link
      Then rss is opened in new tab


    Scenario:  user opens youtube link
      Given go to home_page
      And find FollowUs links
      When user opens youtube link
      Then youtube is opened in new tab