
Feature:Verify All Products and product detail page
  Background:

  Scenario Outline: Test Case 7: Verify All Products and product detail page
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Products button
    Then Verify user is navigated to ALL PRODUCTS page successfully
    And Click on View Product of first product
    And Logout
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |


