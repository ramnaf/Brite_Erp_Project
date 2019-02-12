package com.briteerp.tests.ramile;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewOrderTest extends TestBase {


    @Test
    public void createNewOrderTest() {

        extentLogger = report.createTest("Create new order test");
        extentLogger.info("Verifying New Product form displayed on the page");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying create a new product with product name and category");

        pages.getNewOderPage().AddAnItem.click();

        pages.getNewOderPage().DropDownBox.click();
        BrowserUtils.wait(2);

        Actions SelectBox = new Actions(Driver.getDriver());
        SelectBox.moveToElement(pages.getNewOderPage().CreateButton).perform();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateButton.click();

        pages.getNewOderPage().inputProductName.sendKeys("polo" + Keys.ENTER);

        SelectBox.moveToElement(pages.getNewOderPage().getDropDownBox).perform();
        pages.getNewOderPage().getDropDownBox.click();
        BrowserUtils.wait(2);

        pages.getNewOderPage().CreateItemButton.click();

        BrowserUtils.wait(2);
        pages.getNewOderPage().inputCategoryName.sendKeys("EERKIN Uyghur Food");

        BrowserUtils.wait(2);

        Actions SelectItemBox = new Actions(Driver.getDriver());

        SelectItemBox.moveToElement(pages.getNewOderPage().saveButton).perform();

        pages.getNewOderPage().saveButton.click();

        BrowserUtils.wait(2);

        Actions SaveItemBox = new Actions(Driver.getDriver());
        SaveItemBox.moveToElement(pages.getNewOderPage().saveItemButton).perform();
        pages.getNewOderPage().saveItemButton.click();

        System.out.println(pages.getNewOderPage().saveItemButton.getText());

        Assert.assertEquals(pages.getNewOderPage().saveItemButton.getText(), "Save");
        BrowserUtils.wait(3);
    }


}
