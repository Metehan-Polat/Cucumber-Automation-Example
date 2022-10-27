Feature:Search Products and Verify Cart After Login
  Background:

  Scenario Outline: Test Case 17 Search Products and Verify Cart After Login
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    When Enter product name in search input and click search button
    Then Verify SEARCHED PRODUCTS is visible
    And Verify all the products related to search are visible
    And Add those products to cart
    And Click Cart button and verify that products are visible in cart
    And Click Signup Login button and submit login details
    And Again, go to Cart page
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |


