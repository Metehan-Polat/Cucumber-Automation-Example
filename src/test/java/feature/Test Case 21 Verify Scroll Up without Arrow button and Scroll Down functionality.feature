Feature:Verify Scroll Up without 'Arrow' button and Scroll Down functionality
  Background:

  Scenario Outline:Test Case 21: Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Scroll down page to bottom Subscription
    Then Verify SUBSCRIPTION is visible
    When Scroll up page to top
    Then Verify that page is scrolled up and Full-Fledged practice website for Automation Engineers text is visible on screen
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |
