Feature:Search Product
  Background:

  Scenario Outline: Test Case 8: Search Product
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When Enter product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

