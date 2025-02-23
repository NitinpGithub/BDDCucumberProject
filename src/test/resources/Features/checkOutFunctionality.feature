Feature: check out functionality

Background:
  Given User navigates to login page

Scenario: adding product into cart
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  Then User is able to see remove sauce labs backpack
  And User is able to see remove sauce labs bolt t shirt
  And User is able to see remove test all the things t shirt red into cart
  And User is able to see remove sauce labs fleece jacket
  And User is able to see remove sauce labs bike light
  And User is able to see remove-sauce-labs-onesie

Scenario: validate check out button
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  Then User is able to see check out button

Scenario: verify check out information options
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User is able to see continue button
  And User is able to see first name field
  And User is able to see last name field
  And User is able to see postal code field

Scenario: verify all valid field in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "Nitin" into first name field
  And User enter "Patil" into last name field
  And User enter "112233" into postal code field
  When User click on continue button
  Then User is able to see finish button
  And User is able to see cancle button

Scenario: only valid first name in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "Nitin" into first name field
  And User enter "" into last name field
  And User enter "" into postal code field
  When User click on continue button
  Then User is able to see error message for valid first name

Scenario: only valid last name in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "" into first name field
  And User enter "Patil" into last name field
  And User enter "" into postal code field
  When User click on continue button
  Then User is able to see error message for valid lastname

Scenario: only valid zip code in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "" into first name field
  And User enter "" into last name field
  And User enter "112233" into postal code field
  When User click on continue button
  Then User is able to see error message for valid zip code

Scenario: all blank field in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "" into first name field
  And User enter "" into last name field
  And User enter "" into postal code field
  When User click on continue button
  Then User is able to see error message for all blank field

Scenario: only empty zipCode in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "Nitin" into first name field
  And User enter "Patil" into last name field
  And User enter "" into postal code field
  When User click on continue button
  Then User is able to see error message for empty zip code

Scenario: only empty first name in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "" into first name field
  And User enter "Patil" into last name field
  And User enter "112233" into postal code field
  When User click on continue button
  Then User is able to see error message for empty first name

Scenario: only empty last name in check out information
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart
  And User add sauce labs backpack into cart into cart
  And User add sauce labs bolt t shirt into cart
  And User add test all the things t shirt red into cart
  And User add sauce labs bike light into cart
  And User add sauce labs onesie into cart
  When User click on cart logo
  And User click on check out button
  Then User enter "Nitin" into first name field
  And User enter "" into last name field
  And User enter "112233" into postal code field
  When User click on continue button
  Then User is able to see error message for empty last name

Scenario: check out all information before order place
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart for price
  And User add sauce labs backpack into cart into cart for price
  And User add sauce labs bolt t shirt into cart for price
  And User add test all the things t shirt red into cart for price
  And User add sauce labs bike light into cart for price
  And User add sauce labs onesie into cart for price
  When User click on cart logo
  And User click on check out button
  Then User enter "Nitin" into first name field
  And User enter "Patil" into last name field
  And User enter "112233" into postal code field
  When User click on continue button
  Then User validate actual price
  And User validate total price

Scenario: check out all information before order place
  When User enter valid username "standard_user" into email field
  And User enter valid password "secret_sauce" into password field
  And User click login button
  Then User add sauce labs fleece jacket into cart for price
  And User add sauce labs backpack into cart into cart for price
  And User add sauce labs bolt t shirt into cart for price
  And User add test all the things t shirt red into cart for price
  And User add sauce labs bike light into cart for price
  And User add sauce labs onesie into cart for price
  When User click on cart logo
  And User click on check out button
  Then User enter "Nitin" into first name field
  And User enter "Patil" into last name field
  And User enter "112233" into postal code field
  When User click on continue button
  Then User validate actual price
  And User validate total price
  And User is able to see finish button
  When User click finish button
  Then User is able to see order successful message








