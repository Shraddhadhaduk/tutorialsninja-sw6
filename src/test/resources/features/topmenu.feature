@regression
Feature: Top Menu functionality
  As a user, I would like to navigate all topmenu tab

 @author_shraddha @sanity @smoke @regression
  Scenario: Verify User Should Navigate To DesktopsPage Successfully
    Given  I am on homepage
    When   Mouse hover on “Desktops” Tab and click all selectMenu method and pass the menu = “Show All Desktops”
    Then   Verify the text ‘Desktops’

   @author_shraddha @regression
  Scenario: Verify User Should Navigate To LaptopsAndNotebooksPage Successfully
    Given  I am on homepage
    When    Mouse hover on “Laptops & Notebooks” Tab and click
    Then   selectMenu method and pass the menu = “Show All Laptops & Notebooks”
    And    Verify the text ‘Laptops & Notebooks’

     @author_shraddha @regression
  Scenario: Verify User Should Navigate To ComponentsPage Successfully
    Given  I am on homepage
    When   Mouse hover on “Components” Tab and click
    Then   call selectMenu method and pass the menu = “Show All Components”
    And   Verify the text ‘Components’