Feature: Check Links For Components

  Scenario: Clicking on a Checkboxes  Link
    Given I am on a homepage of heroku app
    When I click "Checkboxes" link
    Then I should be navigated to the checkboxes page

  Scenario: Clicking on a Basic Auth Link
    Given I am on a homepage of heroku app
    When I click "Frames" link
    Then I should be navigated to the frames page