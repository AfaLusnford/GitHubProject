Feature: Home page search


  Background:
    Given im on the home page


  Scenario: search github for the term "create-react-app" from the landing page search
    When i search github for the term "create-react-app" from the landing page search
    Then i should be able to see a count of matching results
    Then first results should match with "facebook/create-react-app"


  Scenario: Click on About button feature
    When i scroll down and click on About button
    Then i have to be able to see about github page