package com.briteerp.tests.belkiz;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchVendorsByNameTest extends TestBase {

    @Test
    public void searchMoreTest(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        //pages.getMenu().new_order.click();
        BrowserUtils.wait(5);
        pages.getNewOderPage().AddAnItem.click();
        BrowserUtils.wait(5);

        pages.getNewOderPage().selectInput.click();
        BrowserUtils.wait(5);

        pages.getNewOderPage().searchMore.click();
        BrowserUtils.wait(5);
    }
}
