package com.myFleet.step_definitions;

import com.myFleet.pages.BasePage;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class linkVerificationStepDefs {

    BasePage basePage = new BasePage();

    @Given("when user click on the link")
    public void when_user_click_on_the_link() {
        basePage.pianoLink.click();
    }
    @Then("user can see How to use pinbar text")
    public void user_can_see_how_to_use_pinbar_text() {
        Assert.assertEquals("How To Use Pinbar", basePage.linkText);
    }

    @Then("pinbar image is displayed")
    public void pinbar_image_is_displayed() {

    }

}
