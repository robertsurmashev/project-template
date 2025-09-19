package com.myFleet.step_definitions;

import com.myFleet.pages.FleetPage_YE;
import com.myFleet.pages.FleetPage_YE;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class B40GRP02_134_StepDefs {


    FleetPage_YE fleetPage = new FleetPage_YE();

    @When("the user navigates to fleet → Vehicles page")
    public void theUserNavigatesToFleetVehiclesPage() {

        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.sleep(4);
        action.moveToElement(fleetPage.fleetMenu).perform();
        fleetPage.vehiclesSubMenu.click();
    }

    @And("the user hovers over the three dots menu")
    public void theUserHoversOverTheThreeDotsMenu() {
        Actions action = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);

        action.moveToElement(fleetPage.dotsMenuItem).perform();
        BrowserUtils.sleep(3);

    }

    @Then("the options view should be displayed")
    public void theOptionsAndShouldBeDisplayed() {

        Assert.assertEquals(fleetPage.view.isDisplayed(), true);
    }
}
