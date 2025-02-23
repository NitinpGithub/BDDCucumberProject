Feature: cart Page Functionality
  Background:
    Given User navigates to login page

Scenario: adding and removing product into cart
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  When User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  Then Check quantity of six product add into cart
  When User click on cart logo
  When User is able to see remove sauce labs bolt t shirt
  And User is able to see remove test all the things t shirt red into cart
  And User is able to see remove sauce labs fleece jacket
  And User is able to see remove sauce labs bike light
  And User is able to see remove-sauce-labs-onesie
  When Check user is able to remove sauce labs bolt t shirt
  And user is able to remove test all the things t shirt red into cart
  And user is able to remove sauce labs fleece jacket
  And user is able to remove sauce labs bike light
  And user is able to remove-sauce-labs-onesie
#  Then Check quantity of one added product
#  Then Check quantity after remove products from cart

Scenario: check added product displayed into cart
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  When User add sauce labs fleece jacket into cart
  Then Check quantity of one product add into cart
  When User click on cart logo
  Then Check user is able to see description of added product from cart

Scenario: update cart quantity
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  When User add sauce labs fleece jacket into cart
  Then Check quantity of one added product
  And User add sauce labs backpack into cart into cart
  Then Check quantity of two added product
  And User add sauce labs bolt t shirt into cart
  Then Check quantity of three added product
  And User add test all the things t shirt red into cart
  Then Check quantity of four added product
  And User add sauce labs bike light into cart
  Then Check quantity of five added product
  And User add sauce labs onesie into cart
  Then Check quantity of six added product
