package com.tutorialsninja.demo.steps;

import com.tutorialsninja.demo.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.demo.pages.MyAccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyAccountSteps {
    @When("I click on my Account link")
    public void iClickOnMyAccountLink() {
        new MyAccountPage().clickOnMyAccountLink();
    }

    @And("I select {string} from my Account options")
    public void iSelectFromMyAccountOptions(String MyAccount) {
        new MyAccountPage().selectMyOptions("My Account");
    }

    @Then("I am navigated to the Register page successfully")
    public void iAmNavigatedToTheRegisterPageSuccessfully() {

    }

    @And("I can verify the {string} Text")
    public void iCanVerifyTheText(String text) {
        new MyAccountPage().verifyTextRegisterAccount();
    }

    @Then("I am navigated to the Login page successfully")
    public void iAmNavigatedToTheLoginPageSuccessfully() {
    }

    @And("I can verify the {string}Text1")
    public void iCanVerifyTheText1(String text1) {
        new MyAccountPage().verifyTextReturningCustomer();
    }

//    @When("I click on my account link")
//    public void iClickOnMyAccountLink() {
//    }

    @And("I select {string} option from my account options")
    public void iSelectOptionFromMyAccountOptions(String MyOption) {
    }

    @And("I enter email {string}")
    public void iEnterEmailTesterGmailCom(String email) {
        new MyAccountPage().enterEmailId();
    }

    @And("I enter password {string}")
    public void iEnterPassword(String password) {
        new MyAccountPage().enterPassword(password);
    }

    @Then("I should login successfully")
    public void iShouldLoginSuccessfully() {
        new MyAccountPage().clickOnLoginButton();
    }

    @And("Verify text “My Account” on the page")
    public void verifyTextMyAccountOnThePage() {
        new MyAccountPage().verifyTextMyAccount();
    }

    @And("I am able to see the {string} text on the page")
    public void iAmAbleToSeeTheTextOnThePage(String arg0) {
    }

    @Then("I should logout successfully")
    public void iShouldLogoutSuccessfully() {
        new MyAccountPage().getTextAccountLogout();
    }

    @And("I click on continue button to navigate to Homepage")
    public void iClickOnContinueButtonToNavigateToHomepage() {
        new MyAccountPage().clickOnMyAccount();
    }

    @And("I enter email address {string}")
    public void iEnterEmailAddress(String arg0) {
        new MyAccountPage().enterEmail("Friends@yahoo.com");
    }

    @And("I enter Telephone number {string}")
    public void iEnterTelephoneNumber(String value) {
        new MyAccountPage().enterTelephone("o7899996574");
    }

    @And("I enter confirm password {string}")
    public void iEnterConfirmPassword(String VALUE) {
        new MyAccountPage().enterConfirmPassword("abc123");
    }

    @And("I select {string} radio button to subscribe")
    public void iSelectRadioButtonToSubscribe(String VALUE) {
        new MyAccountPage().clickOnYesRadioButton();
    }

    @And("I click on the privacy policy checkbox")
    public void iClickOnThePrivacyPolicyCheckbox() {
        new LaptopsAndNotebooksPage().getCheckOutText();
    }

    @And("I click on continue button of registration page")
    public void iClickOnContinueButtonOfRegistrationPage() {
        new MyAccountPage().clickOnMyAccount();
    }

    @Then("I should see account successfully created message {string}")
    public void iShouldSeeAccountSuccessfullyCreatedMessage(String VALUE) {
        new MyAccountPage().getTextAccountLogout();
    }

    @And("I click on continue button")
    public void iClickOnContinueButton() {
        new MyAccountPage().clickOnContinueLink();
    }
}
