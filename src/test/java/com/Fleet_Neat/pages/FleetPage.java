package com.Fleet_Neat.pages;

import com.Fleet_Neat.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FleetPage {

    public FleetPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1'][normalize-space()='Fleet']")
    public WebElement fleetMenu;

    @FindBy(xpath = "//span[normalize-space()='Vehicles']")
    public WebElement vehiclesSubMenu;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'][normalize-space()='...'])[2]")
    public WebElement dotsMenuItem;

    @FindBy(xpath = "//div[@id='sidebar-right']")
    public WebElement view;

}

