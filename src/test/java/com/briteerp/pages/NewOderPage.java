package com.briteerp.pages;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewOderPage {

    public NewOderPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    //TODO: Write you Page Object Model below

    public @FindBy(linkText = "Add an item")
    WebElement AddAnItem;

    public @FindBy(xpath = "//div[@class='o_input_dropdown']//input[@type='text']")

    WebElement DropDownBox ;

    public  @FindBy(xpath = " //a[contains(text(),'Create and Edit...')]")

    WebElement CreateButton ;

    public @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")

    WebElement inputProductName ;

    public  @FindBy (xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/input[1]")

    WebElement getDropDownBox;

    public  @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]")

    WebElement inputCategoryName ;

    public @FindBy(xpath = "/html[1]/body[1]/ul[2]/li[9]")

    WebElement CreateItemButton ;

    public  @FindBy(xpath = "/html[1]/body[1]/div[7]/div[1]/div[1]/div[3]/button[1]/span[1]")

    WebElement saveButton ;

    public  @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[3]/button[1]/span[1]")

    WebElement saveItemButton ;


    public  @FindBy(className = "modal-content")

    WebElement createProductForm ;


    public  @FindBy(xpath = "//th[contains(text(),'Product')]")

    WebElement product ;

    public  @FindBy(xpath = "/html[1]/body[1]/div[5]/div[1]/div[1]/div[1]/h4[1]")

    WebElement createProduct ;

    public  @FindBy(xpath = "//label[contains(text(),'Category')]")

    WebElement category ;

    public  @FindBy(xpath = " //label[contains(text(),'Vendor')]")

    WebElement vendor ;

    public  @FindBy(xpath = "//label[contains(text(),'Price')]")

    WebElement price ;


    public  @FindBy(xpath = "//span[@class='o_stat_text o_not_hover text-success']")

    WebElement active ;






}
