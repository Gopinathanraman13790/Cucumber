#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#Feature: To test Telecom AddUser functionality
#  Scenario: verify Adduser with valid values
#    Given The Telecome Adduser details are adding the AddCustomer page
#    When The user enter the valid values
#    And The user clicks the Submit button
#    Then the user should be in addUsers id home page
Feature: To test Telecom AddUser functionality

  Scenario: verify Adduser with valid values
    Given The Telecome Adduser details are adding the AddCustomer page
    When The user enter the valid values
      | FirstName | Gopi           |
      | Lastname  | Nathan         |
      | Email     | gopi@gmail.com |
      | Address   | Chennai        |
      | Phone     | 9876543213     |
    And The user clicks the Submit button
    Then the user should be in addUsers id home page
