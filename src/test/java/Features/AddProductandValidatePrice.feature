Feature: Validate the price when user purchases a product

Scenario: Validate Printed Chiffron Dress 

Given User is on automationpractice page
When user enter "PRINTED CHIFFRON DRESS" in search box
And user clicks on search Button
And user clicks on PRINTED CHIFFRON DRESS result
And user clicks on Add to Cart button
And user clicks on proceed to checkout button
And verifies total prrice to "18.40"
