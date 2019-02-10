package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class TodaysOrdersPage {

    public TodaysOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TODO: Write you Page Object Model below


    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[2]/li[1]/a")
    WebElement todaysOrderPageButton;
}
