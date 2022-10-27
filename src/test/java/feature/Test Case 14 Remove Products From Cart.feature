Feature: Remove Products From Cart
  Background:

  Scenario Outline:Test Case 14: Remove Products From Cart
    Given Navigate to "<Browser>"
    And Navigate to Url
    And Click View Product for any product on home page
    And Click Add to cart button
    When Click View Cart button
    Then Verify that cart page is displayed
    When  Click X button corresponding to particular product
    Then Verify that product is removed from the cart
    And Close

    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

