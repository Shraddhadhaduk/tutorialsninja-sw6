package com.tutorialsninja.demo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TopMenuSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("Mouse hover on “Desktops” Tab and click all selectMenu method and pass the menu = “Show All Desktops”")
    public void mouseHoverOnDesktopsTabAndClickAllSelectMenuMethodAndPassTheMenuShowAllDesktops() {
    }

    @Then("Verify the text ‘Desktops’")
    public void verifyTheTextDesktops() {
    }

    @When("Mouse hover on “Laptops & Notebooks” Tab and click")
    public void mouseHoverOnLaptopsNotebooksTabAndClick() {
    }

    @Then("selectMenu method and pass the menu = “Show All Laptops & Notebooks”")
    public void selectmenuMethodAndPassTheMenuShowAllLaptopsNotebooks() {
    }

    @And("Verify the text ‘Laptops & Notebooks’")
    public void verifyTheTextLaptopsNotebooks() {
    }

    @When("Mouse hover on “Components” Tab and click")
    public void mouseHoverOnComponentsTabAndClick() {
    }

    @Then("call selectMenu method and pass the menu = “Show All Components”")
    public void callSelectMenuMethodAndPassTheMenuShowAllComponents() {
    }

    @And("Verify the text ‘Components’")
    public void verifyTheTextComponents() {
    }
}
