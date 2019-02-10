package com.briteerp.tests.mutellip;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewOrderPageTest extends TestBase{



    @Test
    public void saveOrders(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().new_order,10);
        BrowserUtils.wait(5);

        pages.getNewOderPage().saveButton.click();


    }

}
