Feature:Verify Scroll Up using 'Arrow' button and Scroll Down functionality
  Background:

  Scenario Outline:Test Case 20: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Scroll down page to bottom Subscription
    Then Verify SUBSCRIPTION is visible
    When Click on arrow at bottom right side to move upward
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |
