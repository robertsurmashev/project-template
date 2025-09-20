package com.myFleet.pages;

import com.myFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEvent_OS {

    public CreateCalendarEvent_OS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[@class=\"title title-level-1\"])[3]")
    public WebElement activities;
    @FindBy(xpath = "//span[text()='Calendar Events']")
    public WebElement calendarEvents;

    @FindBy(xpath = "//a[@title=\"Create Calendar event\"]")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//input[@data-name=\"recurrence-repeat\"]")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "(//input[@class=\"recurrence-subview-control__number\"])[1]")
    public WebElement repeatEveryBox;

    @FindBy(xpath = "//h1[text()='Create Calendar event']")
    public WebElement justToClick;

    @FindBy(xpath = "(//div[@class=\"recurrence-subview-control__item\"]//span)[2]")
    public WebElement errorMessageBox;

    @FindBy(xpath = "//span[text()='The value have not to be less than 1.']")
    public WebElement errorMessage1;

    @FindBy(xpath = "//span[text()='The value have not to be more than 99.']")
    public WebElement errorMessage2;


}
