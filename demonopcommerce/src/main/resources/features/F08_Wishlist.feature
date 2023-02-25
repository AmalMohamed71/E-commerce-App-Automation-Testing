@smoke
  Feature:   F08_Wishlist | user could add products to wishlist and remove it

    Scenario: user can add product to wishlist
      Given  get homepage
      When  user click on wishlist button
      Then success message appear



    Scenario: user can view his wishlist
      Given  navigate to homepage
      When  user click-on wishlist button
      And user click on wishlist tab
      Then wishlist has the products that was added