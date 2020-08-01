Feature: Tsum testing

  Scenario: Adding footwear to cart
    Given Main page is open
    And Confirm geo-position
    And Choose footwear category
    And Footwear page is open
    And Choose product
    And Product page is open
    And Add product to Cart
    And Click on the Cart button
    And Cart page is opened
    Then The selected product is in the cart

    