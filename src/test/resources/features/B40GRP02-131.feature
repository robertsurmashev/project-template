Feature: User should be able to click How To Use Pinbar link

Scenario: Verify that Learn how to use this space link is displayed
  Given user loged in
And when user click on the link
  Then user can see How to use pinbar text

  Scenario: Verify that user can see pinbar image
    Given user loged in
    And when user click on the link
    Then pinbar image is displayed