package com.briteerp.tests.ramile;

import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyRightTest extends TestBase {



    @Test
    public void copyRigtTest(){

        extentLogger=report.createTest("Copyright displaying test");
        extentLogger.info("Verifying copyright is displayed on home page");

        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);

        wait.until(ExpectedConditions.visibilityOf(pages.getLunchAccountPage().copyRigt));

        String copyRigtText=pages.getLunchAccountPage().copyRigt.getText();

        System.out.println(copyRigtText);
        Assert.assertEquals(copyRigtText,"Odoo");
    }
}
