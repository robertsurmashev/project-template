package com.myFleet.step_definitions;

import com.myFleet.pages.BasePage;
import com.myFleet.pages.LoginPage;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class B40GRP02_131_StepDefs {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();

    @Given("when user click on the link")
    public void when_user_click_on_the_link() {
        basePage.pianoLink.click();
    }
    @Then("user can see How to use pinbar text")
    public void user_can_see_how_to_use_pinbar_text() {
        Assert.assertEquals("How To Use Pinbar", basePage.linkText.getText());
    }

    @Then("pinbar image is displayed")
    public void pinbar_image_is_displayed() {
        String actualSrc = basePage.pinbarImg.getAttribute("src");
        String expected = "https://qa3.vytrack.com/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertEquals(actualSrc, expected);
    }

    @Given("user loged in")
    public void userLogedIn() {
        Driver.getDriver().get("https://qa3.vytrack.com/");
        loginPage.login("user7", "UserUser123");
        BrowserUtils.sleep(3);
    }


}
