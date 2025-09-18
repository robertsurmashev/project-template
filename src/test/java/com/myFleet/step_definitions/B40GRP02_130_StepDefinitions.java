package com.myFleet.step_definitions;

import com.myFleet.pages.LoginPage;
import com.myFleet.pages.OroincDocPage;
import com.myFleet.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class B40GRP02_130_StepDefinitions {

    OroincDocPage oroincDocPage = new OroincDocPage();
    LoginPage loginPage = new LoginPage();

    @Given("user should login as {string} with {string} and {string} to transmuda main page")
    public void user_should_login_as_with_and_to_transmuda_main_page(String name,String username, String password) throws InterruptedException {

        loginPage.login(username,password);
    }

    @Then("user should click on the question mark icon")
    public void userShouldClickOnTheQuestionMarkIcon() {

        oroincDocPage.getHelpIcon.click();

    }

    @And("user has to have access to the Oroinc Documentation page")
    public void userHasToHaveAccessToTheOroincDocumentationPage() {

        BrowserUtils.switchToWindow("Welcome to Oro Documentation");
        BrowserUtils.verifyElementDisplayed(oroincDocPage.oroDocPage);

    }
}

