package com.myFleet.step_definitions;

import com.myFleet.pages.CreateCalendarEvent_OS;
import com.myFleet.pages.LoginPage;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class B40GRP02_137_StepDefinitions {

    CreateCalendarEvent_OS createCalendarEvent = new CreateCalendarEvent_OS();
    LoginPage loginPage = new LoginPage();


    @Given("User is logged in as a user")
    public void userIsLoggedInAsAUser() {
        Driver.getDriver().get("https://qa.transmuda.com/user/login");
        loginPage.login("user50", "UserUser123");
    }

    @Given("User is on the create calendar event page")
    public void user_is_on_the_create_calendar_event_page() {
        BrowserUtils.sleep(2);
        BrowserUtils.hover(createCalendarEvent.activities);
        createCalendarEvent.calendarEvents.click();
        BrowserUtils.sleep(2);
        createCalendarEvent.createCalendarEvent.click();
    }


    @And("user clicks repeat checkbox")
    public void userClicksRepeatCheckbox() {
        BrowserUtils.sleep(1);
        createCalendarEvent.repeatCheckbox.click();
    }

    @Then("user enters integer less than {int} into the input box")
    public void userEntersIntegerLessThanIntoTheInputBox(int arg0) {
        BrowserUtils.waitForVisibility(createCalendarEvent.repeatEveryBox, 5);
        createCalendarEvent.repeatEveryBox.click();
        createCalendarEvent.repeatEveryBox.sendKeys(Keys.BACK_SPACE);
        createCalendarEvent.repeatEveryBox.sendKeys("0");
        createCalendarEvent.justToClick.click();
        // this is to click somewhere on the page because error message won't show up without it
    }

    @Then("user should see error message")
    public void userShouldSeeErrorMessage() {
        BrowserUtils.sleep(1);
        String actualText = createCalendarEvent.errorMessageBox.getText();
        String expectedText = "The value have not to be more than 99.";
        String expectedText2 = "The value have not to be less than 1.";
        Assert.assertTrue(actualText.equals(expectedText2) ||
                actualText.equals(expectedText));

    }

    @Then("user enters integer more than {int} into the input box")
    public void userEntersIntegerMoreThanIntoTheInputBox(int arg0) {
        BrowserUtils.waitForVisibility(createCalendarEvent.repeatEveryBox, 5);
        createCalendarEvent.repeatEveryBox.click();
        createCalendarEvent.repeatEveryBox.sendKeys(Keys.BACK_SPACE);
        createCalendarEvent.repeatEveryBox.sendKeys("100");
        createCalendarEvent.justToClick.click();
        // this is to click somewhere on the page because error message won't show up without it

    }
}
