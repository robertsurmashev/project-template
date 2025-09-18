package com.myFleet.pages;

import com.myFleet.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

public class MainModules_Page_MA {



        public MainModules_Page_MA() {


            PageFactory.initElements(Driver.getDriver(), this);


        }


        public List<String> getTableHeaders() {
            return Driver.getDriver().findElements((By) tableHeaders)
                    .stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());
        }


        @FindBy(xpath = "//table//th")
        public WebElement tableHeaders;


        @FindBy(xpath = "//span[normalize-space()='Fleet' and contains(@class, 'title title-level-1')]")
        public WebElement fleetDropdown;

        @FindBy(xpath = "//span[normalize-space()='Vehicles Model' and contains(@class, 'title title-level-2')]")
        public WebElement vehiclesModels;

        @FindBy(xpath = "//th//span[@class='grid-header-cell__label']")
        public List<WebElement> vehiclesModelsColumns;

        @FindBy(xpath = "//div[.='You do not have permission to perform this action.']")
        public WebElement noPermissionMessage;


        @FindBy(xpath = "//span[.='Model Name']")
        public WebElement modelName;


        @FindBy(xpath = "//span[.='Make']']")
        public WebElement make;

        @FindBy(xpath = "//span[.='Can be requested']")
        public WebElement canBeRequested;

        @FindBy(xpath = "//span[.='CVVI']")
        public WebElement catalogValue;

        @FindBy(xpath = "//span[.='CO2 Fee (/month)']")
        public WebElement co2Fee;

        @FindBy(xpath = "//span[.='Cost (Depreciated)']")
        public WebElement cost;

        @FindBy(xpath = "//span[.='Total Cost (Depreciated)']")
        public WebElement totalCost;

        @FindBy(xpath = "//span[.='CO2 Emissions']")
        public WebElement co2Emissions;

        @FindBy(xpath = "//span[.='Fuel Type']")
        public WebElement fuelType;

        @FindBy(xpath = "//span[.='Vendors']")
        public WebElement vendors;


    }


