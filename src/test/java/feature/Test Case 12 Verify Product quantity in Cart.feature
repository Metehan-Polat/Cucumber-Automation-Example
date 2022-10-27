Feature:Verify Product quantity in Cart
  Background:

  Scenario Outline: Test Case 12: Verify Product quantity in Cart
    Given Navigate to "<Browser>"
    And Navigate to Url
    And Click View Product for any product on home page
    And Increase quantity to four
    And Click Add to cart button
    When Click View Cart button
    Then Verify that product is displayed in cart page with exact quantity
    And Close
    Examples:

      | Browser |
      | Chrome  |
      | Firefox |
