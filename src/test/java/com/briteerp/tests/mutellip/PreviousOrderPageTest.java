package com.briteerp.tests.mutellip;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PreviousOrderPageTest extends TestBase{


    @Test
    public void confirmOrderStatus(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().previous_order,10);
        BrowserUtils.wait(5);


        pages.getPreviousOrdersPage().confirmOrderCheckBox.click();
        Assert.assertTrue(pages.getPreviousOrdersPage().confirmOrderCheckBox.isSelected());

    }

    @Test
    public void printOrderReceit(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().previous_order,10);
        BrowserUtils.wait(5);


        pages.getPreviousOrdersPage().confirmOrderCheckBox.click();
        pages.getPreviousOrdersPage().printButon.click();
        pages.getPreviousOrdersPage().lunchOrderButton.click();
        pages.getPreviousOrdersPage().print.click();



    }

    @Test
    public void export(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().previous_order,10);
        BrowserUtils.wait(5);

        pages.getPreviousOrdersPage().confirmOrderCheckBox.click();
        pages.getPreviousOrdersPage().actionButton.click();
        pages.getPreviousOrdersPage().exportButton.click();

    }


}
