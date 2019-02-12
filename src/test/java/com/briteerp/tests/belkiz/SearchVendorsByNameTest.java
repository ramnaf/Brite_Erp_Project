package com.briteerp.tests.belkiz;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchVendorsByNameTest extends TestBase {

    @Test
    public void searchMoreTest(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        //pages.getMenu().new_order.click();
        BrowserUtils.wait(2);
        pages.getNewOderPage().AddAnItem.click();
        BrowserUtils.wait(2);

        pages.getNewOderPage().selectInput.click();
        BrowserUtils.wait(2);

        pages.getNewOderPage().searchMore.click();
        BrowserUtils.wait(2);

    }

    @Test
    public void searchByName(){
        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(2);
        pages.getNewOderPage().vendorField.click();
        pages.getNewOderPage().vendorSearchMoreButton.click();
        pages.getNewOderPage().vendorSearchField.sendKeys("alex");
        pages.getNewOderPage().nameSelection.click();
        BrowserUtils.wait(2);
        List<String> allProducts=BrowserUtils.getElementsText(pages.getNewOderPage().allSearchedProducts);
        Assert.assertFalse(pages.getNewOderPage().allSearchedProducts.isEmpty());
        BrowserUtils.wait(3);
    }
    @Test
    public void searchByTag(){
        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(2);
        pages.getNewOderPage().vendorField.click();
        pages.getNewOderPage().vendorSearchMoreButton.click();
        pages.getNewOderPage().vendorSearchField.sendKeys("a");
        pages.getNewOderPage().tagSelection.click();
        BrowserUtils.wait(2);
        List<String> allProducts=BrowserUtils.getElementsText(pages.getNewOderPage().allSearchedProducts);
        Assert.assertFalse(pages.getNewOderPage().allSearchedProducts.isEmpty());
        BrowserUtils.wait(3);

    }

    @Test
    public void searchBySalesPersonTest(){
        searchMoreTest();

        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(2);
        pages.getNewOderPage().vendorField.click();
        pages.getNewOderPage().vendorSearchMoreButton.click();

        pages.getNewOderPage().vendorSearchField.sendKeys("v");
        pages.getNewOderPage().selesPersonSelection.click();
        BrowserUtils.wait(2);
        List<String> allProducts=BrowserUtils.getElementsText(pages.getNewOderPage().allSearchedProducts);
        Assert.assertFalse(pages.getNewOderPage().allSearchedProducts.isEmpty());
        BrowserUtils.wait(3);


    }

    @Test
    public void searchByRelatedCompany(){
        searchMoreTest();

        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(2);
        pages.getNewOderPage().vendorField.click();
        pages.getNewOderPage().vendorSearchMoreButton.click();

        pages.getNewOderPage().vendorSearchField.sendKeys("h");
        pages.getNewOderPage().relatedCompanySelection.click();
        BrowserUtils.wait(2);
        List<String> allProducts=BrowserUtils.getElementsText(pages.getNewOderPage().allSearchedProducts);
        Assert.assertFalse(pages.getNewOderPage().allSearchedProducts.isEmpty());
        BrowserUtils.wait(3);
    }
    @Test
    public void createAndEditButton(){

        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(2);
        pages.getNewOderPage().vendorField.click();
        pages.getNewOderPage().orderCreateAndEditButton.click();
        Assert.assertTrue(pages.getNewOderPage().createVendorPageTitle.isDisplayed());
    }

    @Test
    public void createCategory(){
        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        pages.getNewOderPage().categoryField.click();
        pages.getNewOderPage().categoryCreateAndEditButton.click();
        pages.getNewOderPage().productCategoryField.sendKeys("Uyghur");
        pages.getNewOderPage().createCategorySaveButton.click();


    }

    @Test
    public void categorySearch(){
        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        pages.getNewOderPage().categoryField.click();
        pages.getNewOderPage().categorySearchMoreButton.click();
        pages.getNewOderPage().categorySearchInputField.sendKeys("uyghur");
        pages.getNewOderPage().searchCategorySelection.click();
        BrowserUtils.wait(10);

    }

    @Test
    public void productPrice(){
        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(3);

        pages.getNewOderPage().priceFiled.clear();
        pages.getNewOderPage().priceFiled.sendKeys("10.00");
        pages.getNewOderPage().productSaveButton.click();
        BrowserUtils.wait(2);
    }

    @Test
    public void savenewCreatedProduct(){
        searchMoreTest();
        pages.getNewOderPage().createButton.click();
        BrowserUtils.wait(3);
        pages.getNewOderPage().productField.sendKeys("Kawap");
        pages.getNewOderPage().categoryField.click();
        pages.getNewOderPage().randomCategory.click();
        pages.getNewOderPage().priceFiled.clear();
        pages.getNewOderPage().priceFiled.sendKeys("10.00");
        pages.getNewOderPage().productSaveButton.click();
        BrowserUtils.wait(2);
    }



}