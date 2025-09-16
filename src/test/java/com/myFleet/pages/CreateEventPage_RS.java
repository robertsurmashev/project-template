package com.myFleet.pages;

import com.myFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEventPage_RS {

    public CreateEventPage_RS() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Activities')]")
    public WebElement activities;

    @FindBy(xpath = "//span[contains(text(),'Calendar Events')]")
    public WebElement calendarEvents;

    @FindBy(xpath = "//a[@title='Create Calendar event']")
    public WebElement createCalendarEventsButton;

    @FindBy(xpath = "//input[@data-name='recurrence-repeat']")
    public WebElement repeatCheckbox;

    @FindBy(xpath = "//input[@class='recurrence-subview-control__number']")
    public WebElement repeatEveryBox;

    @FindBy(xpath = "(//span[@class='validation-failed'])[2]")
    public WebElement warningMessage;
}
