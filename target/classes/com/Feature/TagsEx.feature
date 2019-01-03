
Feature: Testing of tagging
    

  @smoke	
  Scenario: user on login page
    Given this is a login test

  @regression
  Scenario: user on home page
    Given this is a home page test
    
    @smoke
  Scenario: user on contact page
    Given this is a contact page test
    
    @regression
  Scenario: user on cusomer page
    Given this is a customer page test
    
    @end2end
  Scenario: end2end1
    Given this is a deals page test
    
    @end2end
  Scenario: user on calling 
    Given this is a calling page test