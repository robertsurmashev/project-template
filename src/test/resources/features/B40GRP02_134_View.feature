Feature: Menu visibility of view, edit, delete options
  User should be able to see View, Edit, Delete when hovering over the three dots menu

  @wip
  Scenario: Display options when hovering over the menu
    Given   the user logged in as "driver"
    When    the user navigates to fleet → Vehicles page
    And     the user hovers over the three dots menu
    Then    the options view should be displayed