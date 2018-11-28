#Author: your.email@your.domain.com
Feature: To test Login functionality

  #using list
  #  Scenario: verify login with valid crediential
  #    Given The user in the demo guru page
  #    When The user enter the valid username,password and click login button
  #      | mngr165242 | nYjadAs |
  #    And The user clicks the login button
  #    Then the user should be in managers home page
  #using Map
  # Scenario: verify login with valid crediential
  #   Given The user in the demo guru page
  #   When The user enter the valid username,password and click login button
  #     | UserName | mngr165242 |
  #     | Password | nYjadAs    |
  #   And The user clicks the login button
  #   Then the user should be in managers home page
  #using multiple values using List
 # Scenario: verify login with valid crediential
 #   Given The user in the demo guru page
 #   When The user enter the valid username,password and click login button
 #     | mngr165242 | nYjadAs   |
 #     | user2      | password2 |
 #     | user3      | password3 |
 #     | user4      | password4 |
 #   And The user clicks the login button
 #   Then the user should be in managers home page
 #using multiple values using map
     Scenario: verify login with valid crediential
    Given The user in the demo guru page
    When The user enter the valid username,password and click login button
      |UserName    | Password  |
      | mngr165242 | nYjadAs   |
      | user2      | password2 |
      | user3      | password3 |
      | user4      | password4 |
    And The user clicks the login button
    Then the user should be in managers home page
    