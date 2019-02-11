package com.briteerp.pages;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

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


    //Belkiz WebElement
    @FindBy(xpath = "//a[.='Search More...']")
    public WebElement searchMore;

    @FindBy(xpath = "//div[@class='o_input_dropdown']//input[@type='text']")
    public WebElement selectInput;

    @FindBy(xpath = "//div[@class='modal-footer']//button[1]")
    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement productField;

    @FindBy(xpath = "//div[@name='supplier']//input[@type='text']")
    public WebElement vendorField;

    @FindBy(xpath = "(//input[@class='o_input ui-autocomplete-input'])[2]")
    public WebElement categoryField;

    @FindBy(xpath = "//input[@class='o_field_float o_field_number o_field_widget o_input']")

    public WebElement priceFiled;



    @FindBy(xpath = "//tbody[@class='ui-sortable']")
    public List<WebElement> allSearchedProducts;

    @FindBy(xpath = "//ul[3]//li[8]//a[1]")
    public WebElement vendorSearchMoreButton;

    @FindBy(xpath = "(//input[@class='o_searchview_input'])[3]")
    public WebElement vendorSearchField;

    @FindBy(xpath = "//em[contains(text(),'Name')]")
    public WebElement nameSelection;
    @FindBy(xpath = "//em[contains(text(),'Tag')]")
    public WebElement tagSelection;
    @FindBy(xpath = "//em[contains(text(),'Salesperson')]")
    public WebElement selesPersonSelection;

    @FindBy(xpath = "//em[contains(text(),'Related Company')]")
    public WebElement relatedCompanySelection;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item']/a[.='Create and Edit...'])[2]")
    public WebElement orderCreateAndEditButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement createVendorPageTitle;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item']/a[.='Create and Edit...'])[2]")
    public WebElement categoryCreateAndEditButton;

    @FindBy(xpath = "//table[@class='o_group o_inner_group']//input[@name='name']")
    public WebElement productCategoryField;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-primary']/span[.='Save'])[2]")
    public WebElement createCategorySaveButton;

    @FindBy(xpath = "(//li[@class='o_m2o_dropdown_option ui-menu-item'])[3]")
    public WebElement categorySearchMoreButton;

    @FindBy(xpath = "(//input[@placeholder='Search...'])[2]")
    public WebElement categorySearchInputField;

    @FindBy(xpath = "//em[contains(text(),'Category')]")
    public WebElement searchCategorySelection;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']/span[.='Save']")
    public WebElement productSaveButton;

    @FindBy(xpath = "(//li[@class='ui-menu-item'])/a[.='Pasta']")
    public WebElement randomCategory;



}