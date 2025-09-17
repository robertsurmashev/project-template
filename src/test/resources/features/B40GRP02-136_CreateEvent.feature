@B40GRP02-136
Feature: As a user, I want to create a recurring (repetitive) calendar event

  Scenario Outline: Verify that users see the number “1” by default in the Repeat Every input option.

    Given user is logged in as "<userType>" with "<username>" and "<password>"
    Given user is on Create Calendar event page
    When user clicks Repeat
    Then user can see number 1 by default in the Repeat Every input option

    Examples:
      | userType      | username        | password    |
      | Truck Driver  | user1           | UserUser123 |
      | Store Manager | storemanager51  | UserUser123 |
      | Sales Manager | salesmanager101 | UserUser123 |

  Scenario Outline: Verify that users see the error message “This value should not be blank.” when the Calendar event
                    Repeat Every field is cleared (delete the number 1).

    Given user is logged in as "<userType>" with "<username>" and "<password>"
    Given user is on Create Calendar event page
    When user clicks Repeat and deletes number
    Then user can see the error message

    Examples:
      | userType      | username        | password    |
      | Truck Driver  | user1           | UserUser123 |
      | Store Manager | storemanager51  | UserUser123 |
      | Sales Manager | salesmanager101 | UserUser123 |


