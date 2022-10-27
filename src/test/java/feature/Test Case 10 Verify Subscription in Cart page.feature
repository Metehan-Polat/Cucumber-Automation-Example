Feature:Verify Subscription in Cart page
  Background:

  Scenario Outline: Test Case 10: Verify Subscription in Cart page
    Given Navigate to "<Browser>"
    And Navigate to Url
    And Click on Cart Button
    When Scroll down to footer
    Then Verify text SUBSCRIPTION
    When Enter email address in input and click arrow button
    Then Verify success message You have been successfully subscribed! is visible
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

