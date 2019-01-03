Feature: cucumber project with map

  
  Scenario: login to application
    Given User should be on login page
    When User enters uname and pass
    |uname|pass|
    |admin|password|
    |mangesh|123456|
    And verify title
    And verify logo
    Then close browser
 