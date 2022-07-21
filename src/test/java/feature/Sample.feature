Feature: Flipkart Search Functionality

  Background: 
    Given launch browser
    When enter url

  @smoketest @regressiontest
  Scenario: Search for Samsung Mobile
    Then search for Samsung Mobile
    Then close broswer

  @regressiontest
  Scenario: Search for Samsung TV
    
    Then search for Samsung TV "Samsung TV"
    Then close broswer

  @integrationtest
  Scenario: Search for MI TV
    
    Then search for MI TV "MI TV"
    Then close broswer
