package com.briteerp.tests.mutellip;
import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TodaysOrdersPageTest extends TestBase {
    @Test
    public void lunchAccountClick(){
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));
        BrowserUtils.waitForClickablility(pages.getMenu().todays_order,10);
        BrowserUtils.wait(5);


    }

}