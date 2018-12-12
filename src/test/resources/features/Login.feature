@tag
Feature: Testing Filter feature
  I want to use this template for my feature file

  Background: Launch neo tr url and enter username and password
    Given Open Browser and launch URL
    When user enter username and password
    And user click on login button

  @tag1
  Scenario: Team service user filter testing after Successful Login
    Given User is on Home Page
    When User Navigate to crc service users
    And click on filter
    Then enter first name and last name
      | First name | Family name |
      | vikram     | testthreeB  |

  @tag2
  Scenario: CRC service user filter testing after Successful Login
    Given User is on Home Page
    When User Navigate to crc service users
    And click on filter
    Then enter first name and last name
      | First name | Family name |
      | upw        | Defecttwo   |
