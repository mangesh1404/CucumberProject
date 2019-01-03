
Feature: cucumber project with table

  
  Scenario: login to application
    Given User should be on login page
    When User enters uname and pass
    |admin|pass|
    And verify title
    And verify logo
    Then user clicks login button	
    And close browser

  