package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOderPage {

    public NewOderPage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    //TODO: Write you Page Object Model below

    @FindBy(xpath = "//a[contains(text(),'Add an item')]")
    public WebElement AddAnItem;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div/div[2]/div[6]/div[2]/table/tbody/tr[1]/td[1]/div/div/in  put")

    public WebElement DropDownBox;

    @FindBy(xpath = " //a[contains(text(),'Create and Edit...')]")

    public WebElement CreateButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")

    public WebElement inputProductName;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/input[1]")

    public WebElement getDropDownBox;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")

    public WebElement inputCategoryName;

    @FindBy(xpath = "/html[1]/body[1]/ul[2]/li[9]")

    public WebElement CreateItemButton;

    @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/button[1]/span[1]")

    public WebElement saveButton;

    @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/span[1]")

    public WebElement saveItemButton;


    @FindBy(xpath = "o_web_client")

    public WebElement newOrderPageDisplay;

    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement searchMore;

    @FindBy(xpath = "//div[@class='o_input_dropdown']//input[@type='text']")
    public WebElement selectInput;

    @FindBy(xpath = "//ul[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content']")
    public WebElement ulList;




}
