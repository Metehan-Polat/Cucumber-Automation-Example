Feature:View Category Products
  Background:

  Scenario Outline: Test Case 15: View Category Products
    Given Navigate to "<Browser>"
    And Navigate to Url
    And Verify that categories are visible on left side bar
    And Click on Women category
    When Click on any category link under Women category, for example: Dress
    Then Verify that category page is displayed and confirm text WOMEN - TOPS PRODUCTS
    When On left side bar, click on any sub-category link of Men category
    Then Verify that user is navigated to that category page
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |
