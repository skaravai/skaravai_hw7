Feature: Tsum testing

  Scenario: Authorization with wrong password
    Given Main page is open
    And PersonalAccount button clicked
    And Fill email field with value "bmtstg@gmail.com"
    And Fill password field with value "qwerty"
    And Enter Submit button
    Then Error message is displayed

  Scenario: Authorization with wrong email
    Given Main page is open
    And PersonalAccount button clicked
    And Fill email field with value "qweqwe@mail.ru"
    And Fill password field with value "Tester123"
    And Enter Submit button
    Then Error message is displayed

#  Scenario: Authorization without email
#    Given Main page is open
#    And PersonalAccount button clicked
#    And Fill password field with value "Tester123"
#    And Enter Submit button
#    Then The user's email is displayed
#
#  Scenario: Authorization without password
#    Given Main page is open
#    And PersonalAccount button clicked
#    And Fill email field with value "bmtstg@gmail.com"
#    And Enter Submit button
#    Then The user's email is displayed

