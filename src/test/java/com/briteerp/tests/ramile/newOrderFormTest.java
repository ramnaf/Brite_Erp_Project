package com.briteerp.tests.ramile;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class newOrderFormTest extends TestBase {

    @Test
    public void newProductFormTest(){

        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying new product form is displayed");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();
        BrowserUtils.wait(3);

        Assert.assertTrue(pages.getNewOderPage().createProductForm.isDisplayed());
        System.out.println("Create a new product form is displayed");


    }

    @Test
    public void createProductDisplayTest() {

        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying create:product is displayed on new product form ");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        String productgetText = pages.getNewOderPage().createProduct.getText();
        System.out.println(productgetText);
        Assert.assertEquals(productgetText, "Create: Product");
        BrowserUtils.wait(3);

    }


    @Test
    public void productDisplayTest() {

        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("\"Verifying product is displayed on new product form ");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        String productgetText = pages.getNewOderPage().product.getText();
        System.out.println(productgetText);
        Assert.assertEquals(productgetText, "Product");
        BrowserUtils.wait(3);

    }

    @Test
    public void categoryDisplayTest() {


        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("\"Verifying category is displayed on new product form ");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        String productgetText = pages.getNewOderPage().category.getText();
        System.out.println(productgetText);
        Assert.assertEquals(productgetText, "Category");
        BrowserUtils.wait(3);
    }


    @Test
    public void VendorDisplayTest() {
        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("\"Verifying vendor is displayed on new product form ");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        String productgetText = pages.getNewOderPage().vendor.getText();
        System.out.println(productgetText);
        Assert.assertEquals(productgetText, "Vendor");
        BrowserUtils.wait(3);


    }

    @Test
    public void priceDisplayTest() {

        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying price is displayed on new product form ");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        String productgetText = pages.getNewOderPage().price.getText();
        System.out.println(productgetText);
        Assert.assertEquals(productgetText, "Price");
        BrowserUtils.wait(3);

    }


    @Test
    public void activeDisplayTest() {

        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("\"Verifying active is displayed on new product form ");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        String productgetText = pages.getNewOderPage().active.getText();
        System.out.println(productgetText);
        Assert.assertEquals(productgetText, "Active");
        BrowserUtils.wait(3);
    }


}
