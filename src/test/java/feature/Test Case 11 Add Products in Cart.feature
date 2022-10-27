
Feature: Add Products in Cart
  Background:

  Scenario Outline:Test Case 11: Add Products in Cart
    Given Navigate to "<Browser>"
    And Navigate to Url
    And Click on Products button
    And Hover over first product and click Add to cart
    And Click Continue Shopping button
    And Hover over second product and click Add to cart
    When Click View Cart button
    Then Verify both products are added to Cart
    Then Verify their prices, quantity and total price
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

