@helpicon
Feature: As a user, i has to have access to Oroinc Documentation page

  Scenario Outline: User can have access to Oroinc Documentation page by clicking on the question mark icon
    Given user should login as "<userType>" with "<username>" and "<password>" to transmuda main page
    Then user should click on the question mark icon
    And user has to have access to the Oroinc Documentation page

    Examples: login values is going to be using in this scenario outlines
      | userType      | username        | password    |
      | Truck Driver  | user34          | UserUser123 |
      | Store Manager | storemanager67  | UserUser123 |
      | Sales Manager | salesmanager134 | UserUser123 |