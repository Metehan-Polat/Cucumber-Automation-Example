
Feature:Place Order: Register while Checkout
  Background:

  Scenario Outline: Test Case 13: Place Order: Register while Checkout
    Given Navigate to "<Browser>"
    And Navigate to Url
    And Click View Product for any product on home page
    And Click Add to cart button
    When Click View Cart button
    Then Verify that cart page is displayed
    And Click Proceed To Checkout
    And Click Register Login button
    When Fill all details in Signup and create account
    Then Verify ACCOUNT CREATED and click Continue button
    And Click on Cart Button
    When Click Proceed To Checkout
    And Enter description in comment text area and click Place Order
    And Enter payment details: Name on Card, Card Number, CVC, Expiration date
    When Click Pay and Confirm Order button
    Then Verify success message Your order has been placed successfully!
    And Close

    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

