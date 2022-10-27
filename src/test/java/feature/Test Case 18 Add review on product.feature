Feature:Add review on product
  Background:

  Scenario Outline: Test Case 18: Add review on product
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When  Click on View Product of first product
    Then Verify Write Your Review is visible
    And Enter name, email and review
    When Submit button CLick
    Then Verify success message Thank you for your review
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

