package com.myFleet.pages;

import com.myFleet.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPageAD {

    public UserPageAD() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Learn how to use this space']")
    public WebElement pianoLink;

    @FindBy(xpath = "//div[@class='clearfix']/h3")
    public WebElement linkText;

    @FindBy(xpath = "//img[@src='/bundles/oronavigation/images/pinbar-location.jpg']")
    public WebElement pinbarImg;

}
