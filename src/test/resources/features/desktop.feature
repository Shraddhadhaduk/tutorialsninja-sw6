@regression
Feature:
  As a User, I would like to use the Desktops page test
 @author_shraddha @smoke @sanity @regression
  Scenario: Verify Product Arrange In AlphaBatical Order
    Given  I am on homepage
    When  Mouse hover on Desktops Tab.and click
    Then  Click on “Show All Desktops”
    And  Select Sort By position "Name: Z to A"
    And  Verify the Product will arrange in Descending order.

   @author_shraddha @regression
  Scenario Outline: Verify Product Added To ShoppingCart SuccessFully
    Given  I am on homepage
    When  Mouse hover on Currency Dropdown and click
    Then  Mouse hover on £Pound Sterling and click
    And Mouse hover on Desktops Tab.
    And Click on “Show All Desktops”
    And Select Sort By position "Name: A to Z"
    And Select product1 “<product>”
    And Verify the Text "<product>"
    And Enter Qty "1” using Select class.
    And Click on “Add to Cart” button
    And Verify the Message “Success: You have added “<product>” to your shopping cart!”
    And Click on link “shopping cart” display into success message
    And Verify the text1 "Shopping Cart"
    And Verify the Product name "<product>"
    And Verify the Model "<model>"
    And Verify the Total "<price>"
    Examples:
      | product      | model      | price   |
      | HTC Touch HD | Product 1  | £74.73  |
      | iPhone       | product 11 | £75.46  |
      | iPod Classic | product 20 | £74.73  |
      | MacBook      | Product 16 | £368.73 |
      | MacBook Air  | Product 17 | £736.23 |
      | Sony VAIO    | Product 19 | £736.23 |