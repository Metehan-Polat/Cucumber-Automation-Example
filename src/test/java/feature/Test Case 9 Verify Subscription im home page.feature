Feature: Verify Subscription im home page
  Background:

  Scenario Outline: Case 9:Verify Subscription im home page
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Scroll down to footer
    Then Verify text SUBSCRIPTION
    When Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

