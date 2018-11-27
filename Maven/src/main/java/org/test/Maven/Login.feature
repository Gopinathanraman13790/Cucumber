#Author: your.email@your.domain.com


Feature: To test Login functionality
 
  Scenario: verify login with valid crediential
    Given The user in the demo guru page
    When  The user enter the valid username,password and click login button
    Then the user should be in managers home page
     