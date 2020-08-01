Feature: Tsum testing

  Scenario: Authorization
    Given Main page is open
    And PersonalAccount button clicked
    And Fill email field with value "bmtstg@gmail.com"
    And Fill password field with value "Tester123"
    And Enter Submit button
    Then The user's email is displayed
