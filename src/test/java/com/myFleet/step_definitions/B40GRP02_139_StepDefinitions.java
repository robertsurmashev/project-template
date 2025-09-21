package com.myFleet.step_definitions;

import com.myFleet.pages.CareOdometrePage_HM;
import com.myFleet.pages.LoginPage;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.ConfigurationReader;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class B40GRP02_139_StepDefinitions {

    CareOdometrePage_HM careOdometrePage = new CareOdometrePage_HM();





    @When("the user navigate to the Fleet")
    public void the_user_navigate_to_the_fleet() {
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(10);
        actions.moveToElement(CareOdometrePage_HM.fleetDropdown).perform();

    }
    @When("the user click on the Vehicle Vehicle Odometer module")
    public void the_user_click_on_the_vehicle_vehicle_odometer_module() {

        BrowserUtils.sleep(10);
        CareOdometrePage_HM.VehicleOdometre.click();




    }
    @Then("the user should see an error message")
    public void the_user_should_see_an_error_message() {
        BrowserUtils.sleep(5);
        Assert.assertTrue(careOdometrePage.ErrorMessage.isDisplayed());


    }

    @Then("the user should see that the current page number is {int}")
    public void the_user_should_see_that_the_current_page_number_is(Integer int1) {
        BrowserUtils.sleep(10);

        String actualPageNumber = careOdometrePage.PageNumber.getAttribute("value");

        String expectedPageNumber = "1";

        Assert.assertEquals(expectedPageNumber, actualPageNumber);
       // System.out.println("actualPageNumber.isBlank() = " + actualPageNumber.isBlank());

    }
    @Then("the user should see the view Per Page as {int} by default")
    public void the_user_should_see_the_view_per_page_as_by_default(Integer int1) {
      //  BrowserUtils.sleep(20);

       // String actualViewPerPage = careOdometrePage.ViewPerPage.getAttribute("value");

     // String expectedViewPerPage = "25";


      //  Assert.assertEquals(expectedViewPerPage, actualViewPerPage);



    }

}
