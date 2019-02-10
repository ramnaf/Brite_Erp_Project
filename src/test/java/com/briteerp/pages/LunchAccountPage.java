package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LunchAccountPage {

    public LunchAccountPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //TODO: Write you Page Object Model below

    @FindBy(xpath = "/html/body/div[1]/div[1]/a/img")
    public WebElement logo;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/a/span")
    public WebElement copyRigt;




    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div[13]/ul[1]/li[3]/a/span")
    public WebElement yourLunchAccountButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody/tr/th/span")
    public WebElement lunch_InvoicingManager3;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/table/tbody[2]/tr[1]/td[2]/div/input")
    public WebElement lunch_InvoicingCheckBox;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/button")
    public WebElement actionButon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[1]/a")
    public WebElement exportButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[2]/div/div[2]/ul/li[2]/a")
    public WebElement deleteButton;



}
