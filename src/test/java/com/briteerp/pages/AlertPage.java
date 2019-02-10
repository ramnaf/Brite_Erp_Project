package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPage {

    public AlertPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    //TODO: Write you Page Object Model below

    public static @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[3]/li[3]/a/span")
    WebElement NewAlert;


}
