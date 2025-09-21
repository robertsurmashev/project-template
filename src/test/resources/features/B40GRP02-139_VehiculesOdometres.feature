Feature: car odometer feature

  User Story: As a user, I want to view car odometer info on the Vehicles Odometers page.
  Accounts are sales manager, store manager, driver.
  @Hicham
  Scenario: verify that Sales managers see the error message

    Given the user logged in as "sales manager"
    When the user navigate to the Fleet
    And the user click on the Vehicle Vehicle Odometer module
    Then the user should see an error message


  Scenario: verify that Store managers see the error message

    Given the user logged in as "store manager"
    When the user navigate to the Fleet
    And the user click on the Vehicle Vehicle Odometer module
    Then the user should see an error message

  Scenario: Driver sees correct default numbers

    Given the user logged in as "driver"
    When the user navigate to the Fleet
    And the user click on the Vehicle Vehicle Odometer module
    Then the user should see that the current page number is 1
    And the user should see the view Per Page as 25 by default







