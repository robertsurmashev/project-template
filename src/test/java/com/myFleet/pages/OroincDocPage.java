package com.myFleet.pages;

import com.myFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OroincDocPage {

    public OroincDocPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(xpath = "//i[@title='Get help']")
    public WebElement getHelpIcon;

    @FindBy(tagName = "h1")
    public WebElement oroDocPage;


}
