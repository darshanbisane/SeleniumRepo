Feature: Test for google application

  Scenario: Test for google title
    Given Open the google application
    When User capture curent page title
    Then Title Should match
