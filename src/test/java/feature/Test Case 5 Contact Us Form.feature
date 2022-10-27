Feature: Contact Us Form
  Background:

  Scenario Outline: Test Case 5: Contact Us Form
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Contact Us button
    Then Verify GET IN TOUCH is visible
    And Enter name, email, subject and message
    And Upload file
    When Click Submit button
    Then Verify success message Success! Your details have been submitted successfully is visible
    And Click Home button and verify that landed to home page successfully
    And Close

    Examples:
      | Browser |
      | Chrome  |
      | Firefox |

