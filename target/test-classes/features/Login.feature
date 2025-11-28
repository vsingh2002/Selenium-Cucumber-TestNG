Feature: Login Page Automation of SauceDemo  Application

  Scenario Outline: Check login is successfull for valid credentials
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And User clicks on login button
    Then User navigated to homepage
    And Close the browser

    Examples:
      | username      | password     |
      | standard_user | secret_sauce |
      | problem_user  | secret_sauce |
      | error_user    | secret_sauce |
      | visual_user   | secret_sauce |
# Scenario: Check Login is successfull for valid credentials
