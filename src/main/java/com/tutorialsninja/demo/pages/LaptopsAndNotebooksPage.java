package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LaptopsAndNotebooksPage extends Utility {
    private static final Logger log = LogManager.getLogger(LaptopsAndNotebooksPage.class.getName());
    @CacheLookup
    @FindBy(linkText = "Laptops & Notebooks")
    WebElement LaptopsAndNotebooks;

    @CacheLookup
    @FindBy(linkText = "Show AllLaptops & Notebooks")
    WebElement ShowAllLaptopsAndNotebooks;

    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement priceHighToLow;
    @CacheLookup
    @FindBy(id = "input-sort")
    WebElement priceHighToLow1;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement MacBook;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='MacBook']")
    WebElement MacBookText;
    @CacheLookup
    @FindBy(id = "button-cart")
    WebElement AddToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    WebElement SuccessShoppingText;

    @CacheLookup
    @FindBy(linkText = "shopping cart")
    WebElement shoppingcart;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping Cart')]")
    WebElement ShoppingCartText;
    @CacheLookup
    @FindBy(linkText = "MacBook")
    WebElement MacBookText1;
    @CacheLookup
    @FindBy(xpath = "//div[@class='input-group btn-block']/input[@type='text']")
    WebElement quantityBox;
    @CacheLookup
    @FindBy(xpath = "//i[@class = 'fa fa-refresh']")
    WebElement refreshButton;
    @CacheLookup
    @FindBy(xpath = "//div[@id='checkout-cart']/div[1]")
    WebElement successMessageRefresh;
    @CacheLookup
    @FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[1]")
    WebElement TotalText;
    @CacheLookup
    @FindBy(linkText = "Checkout")
    WebElement Checkout;

    @CacheLookup
    @FindBy(linkText = "Checkout")
    WebElement CheckoutText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='New Customer']")
    WebElement newCustomerText;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Guest Checkout']")
    WebElement GuestCheckoutText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-account']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    WebElement firstName;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-email']")
    WebElement email;

    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-telephone'")
    WebElement telephone;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-address-1")
    WebElement address1;
    @CacheLookup
    @FindBy(xpath = "/input[@id='input-payment-city']")
    WebElement city;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    WebElement postcode;

    @CacheLookup
    @FindBy(xpath = "//select[@id='input-payment-country']")
    WebElement country;
    @CacheLookup
    @FindBy(xpath = "/select[@id='input-payment-zone']")
    WebElement region;
    @CacheLookup
    @FindBy(xpath = "//input[@id='button-guest']")
    WebElement guestContinueButton;

    @CacheLookup
    @FindBy(xpath = "//textarea[@name='comment']")
    WebElement comments;

    @CacheLookup
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement continueButtonLast;

    @CacheLookup
    @FindBy(xpath = "//input[@name = 'agree']")
    WebElement agree;
    @CacheLookup
    @FindBy(xpath = "//div[@class='alert alert-warning alert-dismissible']")
    WebElement warningText;

    public void mouseHoverOnDesktopLinkAndClick() {
        log.info("HoverOnDesktop" + LaptopsAndNotebooks.toString());
        mouseHoverToElementAndClick(LaptopsAndNotebooks);

    }

    public void clickOnShowAllLaptopsAndNotebooks() {
        log.info("clickOnShowAllLaptopsAndNotebooks" + ShowAllLaptopsAndNotebooks.toString());
        clickOnElement(ShowAllLaptopsAndNotebooks);

    }

    public String PriceHighToLow() {
        String message = getTextFromElement(priceHighToLow1);
        log.info("GettingPriceToLowText" + priceHighToLow1.toString());
        return message;
    }

    public void selectPriceHighToLow() {
        selectByVisibleTextFromDropDown(priceHighToLow, "PriceHighToLow");
        log.info("selectPrice " + priceHighToLow.toString());
    }

    public void clickOnMacBook() {
        log.info("ClickOnMacBook" + MacBook.toString());
        clickOnElement(MacBook);
    }

    public String getMacBookText() {
        String message = getTextFromElement(MacBookText);
        log.info("GetMacBookText" + MacBookText.toString());
        return message;
    }

    public void clickOnAddOnCart() {
        log.info("ClickOnAddCart" + AddToCart.toString());
        clickOnElement(AddToCart);
    }

    public String getSuccessShoppingText() {
        String message = getTextFromElement(SuccessShoppingText);
        log.info("GetSuccessShoppingText" + SuccessShoppingText.toString());
        return message;
    }

    public void clickOnShoppingCart() {
        log.info("ClickOnShoppingCart" + shoppingcart.toString());
        clickOnElement(shoppingcart);
    }

    public String getShoppingCartText() {
        String message = getTextFromElement(ShoppingCartText);
        log.info("GetShoppingCartText" + ShoppingCartText.toString());
        return message;
    }

    public String getMacBookText1() {
        String message = getTextFromElement(MacBookText1);
        log.info("GetMacBookText" + MacBookText1.toString());
        return message;
    }

    public void clearAndAddQuantity(String quantity) {
        quantityBox.clear();
        sendTextToElement(quantityBox, quantity);
        log.info("clearAndAddQuantity" + quantityBox.toString());
    }

    public void clickOnUpdate() {
        clickOnElement(refreshButton);
        log.info("clickOnUpdate" + refreshButton.toString());
    }

    public Boolean isSuccessMessageAppearing(String message) {
        log.info("SuccessMessage" + successMessageRefresh.toString());
        return getTextFromElement(successMessageRefresh).contains("Success: You have modified your shopping cart!");
    }

    public String getTotalText() {
        String message = getTextFromElement(TotalText);
        log.info("getTotalText" + TotalText.toString());
        return message;
    }

    public void clickOnCheckOut() {
        log.info("clickOnCheckOut" + Checkout.toString());
        clickOnElement(Checkout);
    }

    public String getCheckOutText() {
        String message = getTextFromElement(CheckoutText);
        log.info("getCheckOut" + CheckoutText.toString());
        return message;
    }

    public String getNewCustomerText() {
        String message = getTextFromElement(newCustomerText);
        log.info("getText" + newCustomerText.toString());
        return message;
    }

    public String getGuestCheckoutText() {
        String message = getTextFromElement(GuestCheckoutText);
        log.info("getGuestCheckoutText" + GuestCheckoutText.toString());
        return message;
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
        log.info("clickOnContinueButton" + continueButton.toString());
    }

    public void enterFirstName(String firstNme) {
        sendTextToElement(firstName, firstNme);
        log.info("enterFirstName" + firstName.toString());
    }

    public void enterLastName(String lastnme) {
        sendTextToElement(lastName, lastnme);
        log.info("enterLastName" + lastName.toString());
    }

    public void enterEmail(String value) {
        sendTextToElement(email, value);
        log.info("enterEmail" + email.toString());
    }

    public void enterPhoneNumber(String value) {
        sendTextToElement(telephone, value);
        log.info("enterPhoneNumber" + telephone.toString());
    }

    public void enterAddress1(String value) {
        sendTextToElement(address1, value);
        log.info("enterAddress1" + address1.toString());
    }

    public void enterCity(String value) {
        sendTextToElement(city, value);
        log.info("enterCity" + city.toString());
    }

    public void enterPostCode(String value) {
        sendTextToElement(postcode, value);
        log.info("enterPostCode" + postcode.toString());
    }

    public void selectCountry(String value) {
        selectByVisibleTextFromDropDown(country, value);
        log.info("selectCountry" + country.toString());
    }

    public void selectRegion(String value) {
        selectByVisibleTextFromDropDown(region, value);
        log.info("selectRegion" + region.toString());
    }

    public void clickOnLastContinueCheckOutButton() {
        clickOnElement(continueButtonLast);
        log.info("clickOnLastContinueCheckOutButton" + continueButtonLast.toString());
    }

    public void enterComments(String value) {
        sendTextToElement(comments, value);
        log.info("enterComments" + comments.toString());
    }

    public void clickOnAgree() {
        clickOnElement(agree);
        log.info("clickOnAgree" + agree.toString());
    }

    public void clickOnGuestContinue() {
        clickOnElement(guestContinueButton);
        log.info("clickOnGuestContinue" + guestContinueButton.toString());
    }


    public String verifyPaymentWarningText() {
        log.info("verifyPaymentWarningText" + warningText.toString());
        return getTextFromElement(warningText);

    }
}
