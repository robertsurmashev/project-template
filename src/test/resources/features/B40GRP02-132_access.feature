Feature: Access to Vehicle Contracts page

  As a user
  I want to access the Vehicle Contracts page
  So that I can view or manage vehicle contracts according to my role

  @access
  Scenario: Store managers can access the Vehicle Contracts page
    Given i am logged in as a Store Manager

    And the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"

  @access
  Scenario: Sales managers can access the Vehicle Contracts page
    Given i am logged in as a Sales Manager

    And the page title should be "All - Vehicle Contract - Entities - System - Car - Entities - System"

  @access-denied
  Scenario: Drivers cannot access the Vehicle Contracts page
    Given I am logged in as a Driver
    Then I should see an error message "You do not have permission to perform this action."