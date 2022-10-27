Feature:Login User with correct email and password
  Background:

  Scenario Outline: Test Case 2: Login User with correct email and password
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Signup Login button
    Then Verify Login to your account
    And  Enter correct name and email address
    When Click login button
    And Logout
    And Close

    Examples:
      | Browser |
      | Chrome  |
      | Firefox |




