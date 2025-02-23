Feature: product page functionality
  Background:
    Given User navigates to login page

  Scenario: view product details
    When User enter valid username "standard_user" into email field
    And User enter valid password "secret_sauce" into password field
    And User click login button
    Then User is able to see product details on product page

  Scenario: verify dropdown
    When User enter valid username "standard_user" into email field
    And User enter valid password "secret_sauce" into password field
    And User click login button
    Then User is able to verify dropdown details on product page

  Scenario: verify all icons
    When User enter valid username "standard_user" into email field
    And User enter valid password "secret_sauce" into password field
    And User click login button
    Then User is able to see cart logo
    And User is able to see burger menu
    And User is able to see twitter logo in footer
    And User is able to see facebook logo in footer
    And User is able to see linkedin logo in footer
    And User is able to see dropdown logo in header


