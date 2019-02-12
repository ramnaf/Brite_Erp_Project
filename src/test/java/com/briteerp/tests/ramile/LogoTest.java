package com.briteerp.tests.ramile;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoTest extends TestBase {


    @Test
    public void logoTest(){

        extentLogger=report.createTest("logo displaying test");
        extentLogger.info("Verifying logo is displayed on home page");

        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        System.out.println(pages.getLunchAccountPage().logo.getText());

        BrowserUtils.wait(3);
        Assert.assertTrue(pages.getLunchAccountPage().logo.isDisplayed());



    }

}
