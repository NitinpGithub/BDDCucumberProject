Feature: check login for valid and invalid data
Background:
  Given User navigates to login page


Scenario Outline: login for valid username and password
  When user enter valid username "<uname>"
  And user enter valid password "<pass>"
  And User click login button
  Then user is able to login successfully "<message>"

  Examples:
  | uname                                          | pass            | message  |
  | standard_user                                  | secret_sauce    | Products |
  | problem_user                                   | secret_sauce    | Products |
  | performance_glitch_user                        | secret_sauce    | Products |
  | error_user                                     | secret_sauce    | Products |
  | visual_user                                    | secret_sauce    | Products |

  @valid
Scenario Outline: login for Negative tests
  When enter invalid orr valid username "<uname>"
  And enter invalid orr valid password "<pass>"
  And User click login button
  Then user is not able to login successfully "<message>"

  Examples:
  | uname                                          | pass                                               | message                                                                   |
  |                                                |                                                    | Epic sadface: Username is required                                        |
  |                                                | secret_sauce                                       | Epic sadface: Username is required                                        |
  | standard_user                                  |                                                    | Epic sadface: Password is required                                        |
  | invalidUser                                    | secret_sauce                                       | Epic sadface: Username and password do not match any user in this service |
  | standard_user                                  | wrongPassword                                      | Epic sadface: Username and password do not match any user in this service |
  | invalidUser                                    | wrongPassword                                      | Epic sadface: Username and password do not match any user in this service |
  | user!@#                                        | secret_sauce                                       | Epic sadface: Username and password do not match any user in this service |
  | standard_user                                  | password!@#                                        | Epic sadface: Username and password do not match any user in this service |
  | userWithAReallyLongUsernameThatExceedsTheLimit | secret_sauce                                       | Epic sadface: Username and password do not match any user in this service |
  | standard_user                                  | passwordWithAReallyLongPasswordThatExceedsTheLimit | Epic sadface: Username and password do not match any user in this service |
  | Standard_User                                  | secret_sauce                                       | Epic sadface: Username and password do not match any user in this service |
  | standard_user                                  |                                                    | Epic sadface: Password is required                                                                          |
  | standard_user                                  |   password                                         | Epic sadface: Username and password do not match any user in this service |
  | standard_user                                  |   password                                         | Epic sadface: Username and password do not match any user in this service |