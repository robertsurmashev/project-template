package com.myFleet.pages;

import com.myFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareOdometrePage_HM {



    public CareOdometrePage_HM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public static WebElement fleetDropdown;

    @FindBy(xpath ="//span[.='Vehicle Odometer']" )
    public static WebElement VehicleOdometre;

    @FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement ErrorMessage;

    @FindBy(xpath = "//input[@class='input-widget']")
    public WebElement PageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement DefaultNumber;

    @FindBy(xpath = "//label[@class='control-label']")
    public WebElement ViewPerPage;
}
