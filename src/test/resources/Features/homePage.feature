Feature: Home Page Functionality
Background:
  Given User navigates to login page

  Scenario: navigate to home page
    Then User is able to see username field
    And User is able to see password field
    And User is able to see login button
    And User is able to see page title

  Scenario: after successful login
    When User enter valid username "standard_user" into email field
    And User enter valid password "secret_sauce" into password field
    And User click login button
    Then User is able to see product page