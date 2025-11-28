Feature: This is background demo

  Background: User is logged in to saucedemo app
    Given User is accessing saucedemo login page
    When User enters valid username and password
    Then User should be able to navigate to Home page

  Scenario: Test menu items
    Given User access the sauce demo app login page
    When User enter valid credentials
    And Click on breadcrumb icon
    Then User should be able to see the menu items

  Scenario: Verify add to cart functionality
    Given User access the sauce demo app login page
    When User enters the valid credentials
    And Click on add to cart button
    Then Item should be added to the cart
