@B40GRP02-137
Feature: As a user, I should see error messages when I enter an invalid integer into the calendar repeat day input box.


  Scenario: Verify that users see error messages when entering integer less than 1
    Given User is logged in as a user
    Given User is on the create calendar event page
    And user clicks repeat checkbox
    Then user enters integer less than 1 into the input box
    Then user should see error message

  Scenario: Verify that users see error messages when entering integer more than 99
    Given User is logged in as a user
    Given User is on the create calendar event page
    And user clicks repeat checkbox
    Then user enters integer more than 99 into the input box
    Then user should see error message