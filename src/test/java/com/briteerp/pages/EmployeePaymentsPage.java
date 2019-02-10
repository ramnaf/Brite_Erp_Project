package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePaymentsPage {
    public EmployeePaymentsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //TODO: Write you Page Object Model below

    @FindBy(xpath ="//div/button[@class='btn btn-sm btn-default o_button_import']" )
    public WebElement importButton;

    @FindBy(xpath = "//input[@placeholder='No file chosen...']")
    public WebElement input;

    @FindBy(xpath = "//div[@class='input-group']//span[1]")
    public  WebElement loadFile;

    @FindBy(xpath = "//div[@class='oe_import_with_file oe_padding col-sm-12']")
    public  WebElement allMap;

    @FindBy(xpath = "//tbody[@class='ui-sortable']")
    public WebElement allOrders;

    @FindBy(xpath = "//td[@class='o_data_cell o_list_number o_required_modifier']")
    public WebElement eachPrice;

}
