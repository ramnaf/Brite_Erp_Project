package com.briteerp.tests.zulyar;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ControlAccountsTest extends TestBase {

    @Test
    public void displayOrderTest(){
        extentLogger=report.createTest("Testing Control Accounts page");

        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying all orders  is displayed");
        BrowserUtils.wait(3);
        pages.getMenu().control_account.click();
        BrowserUtils.wait(3);
        Assert.assertTrue(pages.getControlAccountsPage().allOrderList.isDisplayed());

    }

    @Test
    public void deleteAnOrderTest(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().control_account,10);
        BrowserUtils.wait(5);
        pages.getMenu().control_account.click();


        pages.getControlAccountsPage().Control_Accounts.click();
        pages.getControlAccountsPage().checkbox.click();
        Assert.assertTrue(pages.getControlAccountsPage().checkbox.isSelected());

        pages.getControlAccountsPage().actionButton.click();

        pages.getControlAccountsPage().deleteButton.click();

        pages.getControlAccountsPage().okButton.click();


    }
}
