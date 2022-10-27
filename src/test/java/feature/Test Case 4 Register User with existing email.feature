Feature: Register User with existing email
  Background:

  Scenario Outline: Test Case 4: Register User with existing email
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and already email address
    When Click Signup button
    And Verify error Email Address already exist! is visible
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

