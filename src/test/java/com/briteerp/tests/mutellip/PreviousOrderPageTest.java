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
        BrowserUtils.waitForClickablility(pages.getMenu().control_account,10);
        BrowserUtils.wait(5);


        pages.PreviousOrdersPage.confirmOrderCheckBox.click();
        Assert.



    }

}
