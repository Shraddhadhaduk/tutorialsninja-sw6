@regression
Feature: Laptops and Notebook page test cases

  @author_shraddha @sanity @smoke @regression
  Scenario: Verify Products Price Display High To Low Successfully
    Given   I am on homepage
    When Mouse hover on Laptops & Notebooks Tab.and click
    Then Click on “Show All Laptops & Notebooks”
    And Select Sort By "Price (High > Low)"
    And Verify the Product price will arrange in High to Low order.

    @author_shraddha @regression
  Scenario: Verify That User Place Order Successfully
    Given   I am on homepage
    When   Mouse hover on Laptops & Notebooks Tab and click
    Then  Click on “Show All Laptops & Notebooks”
    And Select Sort By "Price (High > Low)"
    And Select Product “MacBook”
    And Verify the text “MacBook”
    And Click on ‘Add To Cart’ button
    And Verify the message “Success: You have added MacBook to your shopping cart!”
    And Click on link “shopping cart” display into success message
    And Verify the text "Shopping Cart"
    And Verify the Product name "MacBook"
    And Change Quantity "2"
    And Click on “Update” Tab
    And Verify the message “Success: You have modified your shopping cart!”
    And Verify the Total £737.45
    And Click on “Checkout” button
    And Verify the text “Checkout”
    And Verify the Text “New Customer”
    And Click on “Guest Checkout” radio button
    And Click on “Continue” tab
    And Fill the mandatory fields
    And Click on “Continue” Button
    And Add Comments About your order into text area
    And Check the Terms & Conditions check box
    And Click on “Continue” button
    And Verify the message “Warning: Payment method required!”