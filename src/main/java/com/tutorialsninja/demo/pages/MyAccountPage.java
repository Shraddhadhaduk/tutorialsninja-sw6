package com.tutorialsninja.demo.pages;

import com.tutorialsninja.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.UUID;

public class MyAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(MyAccountPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//li/a")
    WebElement options;
    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopLink;
    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'My Account')]")
    WebElement myAccount;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register Account')]")
    WebElement registerAccount;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Returning Customer']")
    WebElement returningCustomer;
    @CacheLookup
    @FindBy(id = "input-firstname")
    WebElement firstName;
    @CacheLookup
    @FindBy(id = "input-lastname")
    WebElement lastName;
    @CacheLookup
    @FindBy(id = "input-email")
    WebElement email;
    @CacheLookup
    @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephone;
    @CacheLookup
    @FindBy(id = "input-password")
    WebElement password;
    @CacheLookup
    @FindBy(id = "input-confirm")
    WebElement confirmPassword;
    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    WebElement yesRadioButton;
    @CacheLookup
    @FindBy(xpath = "//input[@name='agree']")
    WebElement privacyPolicy;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
    WebElement accountText;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueTab;
    @CacheLookup
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
    WebElement myAccountTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Account Logout')]")
    WebElement accountLogoutText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement continue1;
    @CacheLookup
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='My Account']")
    WebElement myAccountText;
    @CacheLookup
    @FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='My Account']")
    WebElement myAccountLink;
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Account Logout']")
    WebElement textAccountLogout;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continue2;

    public void selectMyOptions(String option) {
        clickOnElement(By.linkText("My Account"));
        List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li/a"));
        for (WebElement element : optionsList) {
            if (element.getText().equalsIgnoreCase(option)) {
                clickOnElement(element);
                break;
            }
        }
    }

    public void clickOnMyAccountLink() {
        log.info("myAccount:" + myAccount.toString());
        clickOnElement(myAccount);
    }

    public String verifyTextRegisterAccount() {
        log.info("registerAccount" +registerAccount.toString());

        return getTextFromElement(registerAccount);
    }

    public String verifyTextReturningCustomer() {
        log.info("returningCustomer" +returningCustomer.toString());

        return getTextFromElement(returningCustomer);
    }

    public void enterFirstName(String fName) {

        sendTextToElement(firstName, fName);
        log.info("firstName" +firstName.toString());
    }

    public void enterLastName(String lName) {
        log.info("LastName" +lastName.toString());

        sendTextToElement(lastName, lName);
    }

    public void enterEmailId() {
        log.info("enterEmailId" +email.toString());

        String randomEmail = randomEmail();
        sendTextToElement(email, randomEmail);
    }

    private static String randomEmail() {

        return "random-" + UUID.randomUUID().toString() + "@example.com";
    }

    public void enterTelephone(String telNum) {
        log.info("enterTelephone" +telephone.toString());

        sendTextToElement(telephone, telNum);
    }

    public void enterPassword(String passWord) {
        log.info("enterPassword" +password.toString());

        sendTextToElement(password, passWord);
    }

    public void enterConfirmPassword(String conPassword) {
        log.info("enterConfirmPassword" +confirmPassword.toString());


        sendTextToElement(confirmPassword, conPassword);
    }

    public void clickOnYesRadioButton() {
        log.info("clickOnYesRadioButton" +yesRadioButton.toString());
        clickOnElement(yesRadioButton);
    }

    public void clickOnPrivacyPolicyCheckBox() {
        log.info("clickOnPrivacyPolicyCheckBox" +privacyPolicy.toString());

        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton() {
        log.info("continueButton" +continueButton.toString());

        clickOnElement(continueButton);
    }

    public String verifyMessageAccountCreated() {
        log.info("verifyMessageAccountCreated" +accountText.toString());

        return getTextFromElement(accountText);
    }

    public void clickOnContinueTab() {
        log.info("clickOnContinueTab" +continueTab.toString());

        clickOnElement(continueTab);
    }

    public void clickOnMyAccountTab() {
        log.info("clickOnMyAccountTab" +myAccountTab.toString());

        clickOnElement(myAccountTab);
    }

    public String verifyTextAccountLogout() {
        log.info("VerifyTextAccountLogout" +accountLogoutText.toString());

        return getTextFromElement(accountLogoutText);
    }

    public void clickOnContinue() {
        log.info("clickOnContinue" +continue1.toString());

        clickOnElement(continue1);
    }

    public void enterEmail(String emailId) {
        log.info("enterEmail" +email.toString());

        sendTextToElement(email, emailId);
    }

    public void enterPasswordField(String passwordField) {
        log.info("enterPasswordField" +password.toString());

        sendTextToElement(password, passwordField);
    }

    public void clickOnLoginButton() {
        log.info("clickOnLoginButton" +loginButton.toString());

        clickOnElement(loginButton);
    }

    public String verifyTextMyAccount() {
        log.info("verifyTextMyAccount" +myAccountText.toString());
        return getTextFromElement(myAccountText);
    }

    public void clickOnMyAccount() {
        log.info("clickOnMyAccount" +myAccountLink.toString());
        clickOnElement(myAccountLink);
    }

    public String getTextAccountLogout() {
        log.info("getTextAccountLogout" +textAccountLogout.toString());

        return getTextFromElement(textAccountLogout);
    }

    public void clickOnContinueLink() {
        log.info("clickOnContinueLink" +continue2.toString());
        clickOnElement(continue2);
    }

}
