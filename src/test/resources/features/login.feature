
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page


  Scenario: Verify login with different user types
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"



# you can use one of the given step here

  Scenario: Verify user can see on vehicles model page
    Given the user logged in as "<userType>"
    Given the user logged in with username as "User1" and password as "UserUser123"





