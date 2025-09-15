package com.myFleet.step_definitions;

import com.myFleet.pages.DriverPage403;
import com.myFleet.pages.LoginPage;
import com.myFleet.utilities.BrowserUtils;
import com.myFleet.utilities.ConfigurationReader;
import com.myFleet.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class B40GRP02_132_StepDefs {
    LoginPage loginPage = new LoginPage();
    DriverPage403 driverPage403 = new DriverPage403();

    @Given("i am logged in as a Store Manager")
    public void i_am_logged_in_as_a_store_manager() {
        Driver.getDriver().get("https://qa.transmuda.com/entity/Extend_Entity_VehicleContract");
        loginPage.login(
                ConfigurationReader.getProperty("store_manager_username"),
                ConfigurationReader.getProperty("store_manager_password")

        );
        BrowserUtils.sleep(2);

    }
       


    @Then("the page title should be {string}")
    public void the_page_title_should_be(String expected) {
        BrowserUtils.sleep(4);
        String current = Driver.getDriver().getTitle();
        Assert.assertEquals(expected, current);
     
    }

    @Given("i am logged in as a Sales Manager")
    public void iAmLoggedInAsASalesManager() {

        Driver.getDriver().get("https://qa.transmuda.com/entity/Extend_Entity_VehicleContract");
        loginPage.login(
                ConfigurationReader.getProperty("sales_manager_username"),
                ConfigurationReader.getProperty("sales_manager_password")

        );

    }

    @Given("I am logged in as a Driver")
    public void IAmLoggedInAsADriver() {
        Driver.getDriver().get("https://qa.transmuda.com/entity/Extend_Entity_VehicleContract");
        loginPage.login(
                ConfigurationReader.getProperty("driver_username"),
                ConfigurationReader.getProperty("driver_password")

        );
    }

    @Then("I should see an error message {string}")
    public void IShouldSeeAnErrorMessage(String expected) {
        String actual = driverPage403.errorMessage.getText();
        Assert.assertEquals(expected, actual);


    }
}
