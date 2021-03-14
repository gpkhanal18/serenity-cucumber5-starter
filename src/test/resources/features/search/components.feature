Feature: Check Links For Components
@ignore
  Scenario: Clicking on a Checkboxes  Link
    Given I am on a homepage of heroku app
    When I click "Checkboxes" link
    Then I should be navigated to the checkboxes page
@ignore
  Scenario: Clicking on a Frames Link
    Given I am on a homepage of heroku app
    When I click "Frames" link
    Then I should be navigated to the frames page

  Scenario: Making a Rest Call
    Given REST Call is made to get books
    When the book "The GodFather" is received in the response
    Then I am on a homepage of heroku app
    And I click "Frames" link
    And I should be navigated to the frames page