package com.myFleet.step_definitions;

import com.myFleet.pages.MainModulesPage_MA;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.Driver;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasePage_StepDefs {

MainModulesPage_MA mainModulesPageMa = new MainModulesPage_MA();

    @Given("user should be able to click on fleet dropdown")
    public void userShouldBeAbleToClickOnFleetDropdown() {

        BrowserUtils.sleep(10);
        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(mainModulesPageMa.fleetDropdown).perform();




    }

    @And("user should be able to click on vehicles models")
    public void userShouldBeAbleToClickOnVehiclesModels() {


        BrowserUtils.waitForVisibility(mainModulesPageMa.vehiclesModels,5).click();






    }





        @Then("user should be able to verify {string} on All Vehicles Model page")
        public void userShouldBeAbleToVerifyOnAllVehiclesModelPage(String moduleName, io.cucumber.datatable.DataTable dataTable) {


            BrowserUtils.sleep(10);
            // expected columns from feature file
            List<String> expectedColumns = dataTable.asList();

            // actual columns from page (make sure your Page Object defines this as List<WebElement>)
            List<String> actualColumns = mainModulesPageMa.vehiclesModelsColumns
                    .stream()
                    .map(el -> el.getText().trim())
                    .filter(text -> !text.isEmpty()) // ignore empty headers
                    .toList();

            // assertion
            Assert.assertEquals(
                    "Table headers do not match for module: " + moduleName,
                    expectedColumns,
                    actualColumns
            );
        }

    @Then("user should see message of {string}")
    public void userShouldSeeMessageOf(String expectedMessage) {


        String actualMessage = mainModulesPageMa.noPermissionMessage.getText();

        Assert.assertEquals(actualMessage,expectedMessage);

    }
}





