Feature:Add to cart from Recommended items
  Background:

  Scenario Outline:Test Case 19:Add to cart from Recommended items
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Scroll to bottom of page
    Then Verify RECOMMENDED ITEMS are visible
    And Click on Add To Cart on Recommended product
    And Click on View Cart button
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

