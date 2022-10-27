Feature:View Cart Brand Products
  Background:

  Scenario Outline:Test Case 16: View Cart Brand Products
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Products button
    Then Verify that Brands are visible on left side bar
    And Click on any brand name
    And On left side bar, click on any other brand link
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |



