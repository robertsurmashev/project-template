@login
Feature: Users should be able to login

  Background:
    Given the user is on the login page

  @wip
  Scenario Outline: Verify login with different user types
    Given the user logged in as "<userType>"
    # Optional: you can also test with specific username/password
    Given the user logged in with username as "<username>" and password as "<password>"

    Examples:
      | userType       | username | password      |
      | driver         | User1    | UserUser123   |
      | sales manager  | User2    | UserUser456   |
      | store manager  | User3    | UserUser789   |
