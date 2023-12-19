Feature: Account Login Page
  As a user I want to use the Login Page

  Background: I am on homepage

  @author_shraddha @sanity @smoke @regression
  Scenario: Verify user should navigate to Login Page successfully
    When  I click on my Account link
    And   I select "Register" from my Account options
    Then  I am navigated to the Register page successfully
    And   I can verify the "Register Account" Text

  @author_shraddha @smoke @regression
  Scenario: Verify user should navigate to Login Page successfully
    When  I click on my Account link
    And   I select "Login" from my Account options
    Then  I am navigated to the Login page successfully
    And   I can verify the "Returning Customer" Text

  @author_shraddha @regression
  Scenario: Verify That User Should Login And Logout Successfully
    When I click on my account link
    And I select "Login" option from my account options
    And I enter email "tester123@gmail.com"
    And I enter password "prime123"
    Then I should login successfully
    And Verify text “My Account” on the page
    And I click on my account link
    And I select "Logout" option from my account options
    And  I am able to see the "Account Logout" text on the page
    Then I should logout successfully
    And I click on continue button to navigate to Homepage

  @author_shraddha @regression
  Scenario: User should register account successfully
    When  I click on my account link
    And   I select "Register" option from my account options
    And   I enter first name "prime"
    And   I enter last name "tester"
    And   I enter email address "tester123@gmail.com"
    And   I enter Telephone number "07458547425"
    And   I enter password "prime123"
    And   I enter confirm password "prime123"
    And   I select "Yes" radio button to subscribe
    And   I click on the privacy policy checkbox
    And   I click on continue button of registration page
    Then  I should see account successfully created message "Your Account Has Been Created!"
    And   I click on continue button
    And   I click on my account link
    And   I select "Logout" option from my account options
    Then  I should logout successfully
    And   I click on continue button