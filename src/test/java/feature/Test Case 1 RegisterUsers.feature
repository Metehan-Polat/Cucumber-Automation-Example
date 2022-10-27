Feature: Register User
  Background:

  Scenario Outline: Test case 1:Register User
    Given Navigate to "<Browser>"
    And Navigate to Url
    When Click on Signup Login button
    Then Verify New User Signup is visible
    And Enter name and email address
    When Click Signup button
    Then Verify that ENTER ACCOUNT INFORMATION is visible
    And Fill details Title, Name, Email, Password, Date of birth
    When Click Create Account button
    Then Verify that ACCOUNT CREATED is visible
    And Click Continue button
    And Logout
    And Close

    Examples:
      | Browser |
      | Chrome  |
      | Firefox |





