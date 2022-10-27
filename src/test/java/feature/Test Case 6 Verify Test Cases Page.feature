
Feature:Verify Test Cases Page
  Background:

  Scenario Outline: Test Case 6: Verify Test Cases Page
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Test Cases button
    Then Verify user is navigated to test cases page successfully
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

