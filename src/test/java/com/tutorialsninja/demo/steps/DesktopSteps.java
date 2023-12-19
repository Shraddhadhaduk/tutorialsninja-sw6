package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DesktopSteps {
    @When("Mouse hover on Desktops Tab.and click")
    public void mouseHoverOnDesktopsTabAndClick() {
        new DesktopPage().mouseHoverOnDesktopLinkAndClick();
    }

    @Then("Click on “Show All Desktops”")
    public void clickOnShowAllDesktops() {
        new DesktopPage().clickOnShowAllDesktops();
    }

    @And("Select Sort By position {string}")
    public void selectSortByPosition(String value) {
        new DesktopPage().selectPositionByZtoA();
    }

    @And("Verify the Product will arrange in Descending order.")
    public void verifyTheProductWillArrangeInDescendingOrder() {
        new DesktopPage().getAllProductNameText();
    }

    @When("Mouse hover on Currency Dropdown and click")
    public void mouseHoverOnCurrencyDropdownAndClick() {
        new DesktopPage().MouseHoverOnCurrencyDropdownAndClick();
    }

    @Then("Mouse hover on £Pound Sterling and click")
    public void mouseHoverOn£PoundSterlingAndClick() {
    }

    @And("Mouse hover on Desktops Tab.")
    public void mouseHoverOnDesktopsTab() {
        new DesktopPage().mouseHoverOnDesktopLinkAndClick();
    }

    @And("Select product “<product>”")
    public void selectProductProduct() {
        new DesktopPage().clickOnShowAllDesktops();
    }

    @And("Verify the Text {string}")
    public void verifyTheText(String value) {
    }

    @And("Enter Qty \"{int}” using Select class.")
    public void enterQtyUsingSelectClass(int arg0) throws Throwable {
        new DesktopPage().enterQuantity();
        // Write code here that turns the phrase above into concrete actions    throw new cucumber.api.PendingException();}
    }

    @And("Click on “Add to Cart” button")
    public void clickOnAddToCartButton() {
        new DesktopPage().clickOnAddToCart();
    }

    @And("Click on link “shopping cart” display into success message")
    public void clickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new DesktopPage().getSuccessText();
    }

    @And("Verify the text {string}")
    public void verifyTheText1(String value) {
        new DesktopPage().clickOnShoppingCart();
    }

    @And("Verify the Product name {string}")
    public void verifyTheProductName(String value) {
        new DesktopPage().verifyProductName();
    }

    @And("Verify the Model {string}")
    public void verifyTheModel(String value) {
        new DesktopPage().verifyModel();
    }

    @And("Verify the Total {string}")
    public void verifyTheTotal(String value) {
        new DesktopPage().verifyTotal();
    }

    @And("Select product{int} “<product>”")
    public void selectProductProduct(int number) {
        new DesktopPage().enterQuantity();
    }

    @And("Verify the Message “Success: You have added “<product>” to your shopping cart!”")
    public void verifyTheMessageSuccessYouHaveAddedProductToYourShoppingCart() {
        new DesktopPage().getSuccessText();
    }

    @And("Verify the text{int} {string}")
    public void verifyTheText(int number, String value) {
    }


}