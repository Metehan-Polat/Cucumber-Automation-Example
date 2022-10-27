Feature:Login User with incorrect email and password
  Background:

  Scenario Outline: Test Case 3: Login User with incorrect email and password
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Signup Login button
    Then Verify Login to your account
    And  Enter incorrect name and email address
    When Click login button
    And Verify error Your email or password is incorrect is visible
    And Close
    Examples:
      | Browser |
      | Chrome  |
      | Firefox |


