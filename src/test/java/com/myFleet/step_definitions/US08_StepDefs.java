package com.myFleet.step_definitions;

import com.myFleet.pages.CreateEventPage_RS;
import com.myFleet.pages.LoginPage;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.ConfigurationReader;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US08_StepDefs {

    LoginPage loginPage = new LoginPage();

    CreateEventPage_RS createEvent = new CreateEventPage_RS();

    @Given("user is logged in as {string} with {string} and {string}")
    public void userIsLoggedInAsWithAnd(String userType, String username, String password) {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        loginPage.login(username, password);
    }

    @Given("user is on Create Calendar event page")
    public void user_is_on_create_calendar_event_page() {

       BrowserUtils.sleep(10);

       BrowserUtils.hover(createEvent.activities);

       BrowserUtils.hover(createEvent.calendarEvents);

       createEvent.calendarEvents.click();

       BrowserUtils.sleep(10);

       createEvent.createCalendarEventsButton.click();
    }

    @When("user clicks Repeat")
    public void user_clicks_repeat() {

        BrowserUtils.sleep(5);

        createEvent.repeatCheckbox.click();
    }

    @Then("user can see number 1 by default in the Repeat Every input option")
    public void user_can_see_number_by_default_in_the_repeat_every_input_option() {

        BrowserUtils.sleep(10);

        String actualDefaultValue = createEvent.repeatEveryBox.getAttribute("value");

        String expectedDefaultValue = "1";

        Assert.assertEquals(expectedDefaultValue, actualDefaultValue);
    }

    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------
    // -----------------------------------------------------------------------------------------------------------------

    @When("user clicks Repeat and deletes number")
    public void usersClickRepeatAndDeletesNumber() {

        BrowserUtils.sleep(10);

        createEvent.repeatCheckbox.click();

        BrowserUtils.sleep(10);

        createEvent.repeatEveryBox.sendKeys(Keys.BACK_SPACE);

        BrowserUtils.sleep(10);

        createEvent.repeatEveryBox.sendKeys(Keys.ENTER);

        BrowserUtils.sleep(10);
    }

    @Then("user can see the error message")
    public void usersCanSeeTheErrorMessage() {

        BrowserUtils.sleep(10);

        Assert.assertTrue(createEvent.warningMessage.isDisplayed());
    }
}
