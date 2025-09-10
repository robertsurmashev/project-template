package com.myFleet.step_definitions;

import com.myFleet.pages.BasePage;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class linkVerificationStepDefs {

    @FindBy(xpath = "a[(.='Learn how to use this space')]")
    public WebElement pinbarLink;

    @Then("users can see: “How To Use Pinbar” and Use the pin icon on the right top corner of page to create  fast access link in the pinbar")
    public void users_can_see_how_to_use_pinbar_and_use_the_pin_icon_on_the_right_top_corner_of_page_to_create_fast_access_link_in_the_pinbar() {
        pinbarLink.click();
    }


}
