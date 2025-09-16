
@login

Feature: Vehicles Model Page Validation
  I want to verify Fleet → Vehicle Models columns
  So that I can ensure table headers are correct





  Scenario: Verify all columns in Vehicles Model table
    Given the user logged in as "store manager"
    Given user should be able to click on fleet dropdown
    And user should be able to click on vehicles models
    Then user should be able to verify "All columns" on All Vehicles Model page
      | MODEL NAME               |
      | MAKE                    |
      | CAN BE REQUESTED        |
      | CVVI                    |
      | CO2 FEE (/MONTH)         |
      | COST (DEPRECIATED)       |
      | TOTAL COST (DEPRECIATED) |
      | CO2 EMISSIONS            |
      | FUEL TYPE                |
      | VENDORS                  |
      | CVVI                     |


    Scenario: Verify that Drivers cannot access the Vehicles Model page
      Given the user logged in as "driver"
      Given user should be able to click on fleet dropdown
      And user should be able to click on vehicles models
      Then user should see message of "You do not have permission to perform this action."








