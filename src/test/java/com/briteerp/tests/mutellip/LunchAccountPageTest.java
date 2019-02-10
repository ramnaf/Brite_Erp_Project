package com.briteerp.tests.mutellip;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LunchAccountPageTest extends TestBase{

    @Test
    public void lunchAccountClick(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().lunch_account,10);
        BrowserUtils.wait(5);


    }

    @Test
    public void export(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().lunch_account,10);
        BrowserUtils.wait(5);

        pages.LunchAccountPage().lunch_InvoicingManager3.click();
        pages.LunchAccountPage().lunch_InvoicingCheckBox.click();
        pages.LunchAccountPage().actionButton.click();
        pages.LunchAccountPage().exportButton.click();



    }


    @Test
    public void export(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().lunch_account,10);
        BrowserUtils.wait(5);

        pages.LunchAccountPage().lunch_InvoicingManager3.click();
        pages.LunchAccountPage().lunch_InvoicingCheckBox.click();
        pages.LunchAccountPage().actionButton.click();
        pages.LunchAccountPage().deleteButton.click();



    }


}