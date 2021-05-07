@Test
Feature: Testing My Cucumber Framework

  Background: To check the login module
    Given User Launching the application
    When User login the application
    Then User successfully on the home page

  Scenario: To check the Product module
    Given Click on product
    When Opening the Add Product
    And User filling the following information
      | Type     | Name           | Code     | Category |
      | Services | Laptop Charger | lenovo01 | General  |
    Then user logout the application
