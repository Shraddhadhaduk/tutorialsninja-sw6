package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopsAndNotebooksSteps {
    @When("Mouse hover on Laptops & Notebooks Tab.and click")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
        new LaptopsAndNotebooksPage().mouseHoverOnDesktopLinkAndClick();
    }

    @Then("Click on “Show All Laptops & Notebooks”")
    public void clickOnShowAllLaptopsNotebooks() {
        new LaptopsAndNotebooksPage().clickOnShowAllLaptopsAndNotebooks();
    }

    @And("Select Sort By {string}")
    public void selectSortBy(String value) {
        new LaptopsAndNotebooksPage().selectPriceHighToLow();
    }

    @And("Verify the Product price will arrange in High to Low order.")
    public void verifyTheProductPriceWillArrangeInHighToLowOrder() {
        new LaptopsAndNotebooksPage().selectPriceHighToLow();
    }

    @And("Select Product “MacBook”")
    public void selectProductMacBook() {
        new LaptopsAndNotebooksPage().clickOnMacBook();
    }

    @And("Verify the text “MacBook”")
    public void verifyTheTextMacBook() {
        new LaptopsAndNotebooksPage().getMacBookText();
    }

    @And("Click on ‘Add To Cart’ button")
    public void clickOnAddToCartButton() {
        new LaptopsAndNotebooksPage().clickOnAddOnCart();
    }

    @And("Verify the message “Success: You have added MacBook to your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        new LaptopsAndNotebooksPage().getSuccessShoppingText();
    }

    @And("Change Quantity {string}")
    public void changeQuantity(String value) {
        new LaptopsAndNotebooksPage().clearAndAddQuantity("2");
    }

    @And("Click on “Update” Tab")
    public void clickOnUpdateTab() {
        new LaptopsAndNotebooksPage().clickOnUpdate();
    }

    @And("Verify the message “Success: You have modified your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveModifiedYourShoppingCart() {
        new LaptopsAndNotebooksPage().getSuccessShoppingText();
    }

    @And("Verify the Total £{double}")
    public void verifyTheTotal£(int number, int number1) {
        new LaptopsAndNotebooksPage().getTotalText();
    }

    @And("Click on “Checkout” button")
    public void clickOnCheckoutButton() {
        new LaptopsAndNotebooksPage().clickOnCheckOut();
    }

    @And("Verify the text “Checkout”")
    public void verifyTheTextCheckout() {
        new LaptopsAndNotebooksPage().getCheckOutText();
    }

    @And("Verify the Text “New Customer”")
    public void verifyTheTextNewCustomer() {
        new LaptopsAndNotebooksPage().getNewCustomerText();
    }

    @And("Click on “Guest Checkout” radio button")
    public void clickOnGuestCheckoutRadioButton() {
        new LaptopsAndNotebooksPage().clickOnGuestContinue();
    }

    @And("Click on “Continue” tab")
    public void clickOnContinueTab() {
        new LaptopsAndNotebooksPage().clickOnContinueButton();
    }

    @And("Fill the mandatory fields")
    public void fillTheMandatoryFields() {
    }

    @And("Click on “Continue” Button")
    public void clickOnContinueButton() {
        new LaptopsAndNotebooksPage().clickOnLastContinueCheckOutButton();
    }

    @And("Add Comments About your order into text area")
    public void addCommentsAboutYourOrderIntoTextArea() {
        new LaptopsAndNotebooksPage().enterComments("YES");
    }

    @And("Check the Terms & Conditions check box")
    public void checkTheTermsConditionsCheckBox() {
        new LaptopsAndNotebooksPage().clickOnAgree();
    }

    @And("Verify the message “Warning: Payment method required!”")
    public void verifyTheMessageWarningPaymentMethodRequired() {
    }
}
