package com.briteerp.tests.zulyar;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OrderByVendorPageTest extends TestBase {

    @Test
    public void individualPriceTest(){

        //PASS
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        extentLogger=report.createTest("Indivisual price test");
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Indivual price in each product by Vendor page");
        pages.getMenu().order_by_vendor.click();

        WebDriverWait wait= new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(pages.getOrderByVendorPage().indivualPrice));

        System.out.println(pages.getOrderByVendorPage().indivualPrice.getText());
        Assert.assertTrue(pages.getOrderByVendorPage().indivualPrice.isDisplayed());


    }
    @Test
    public void priceCheckingTest(){
        extentLogger.info("Loging to application");

        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying total price from Orders by Vendor page");
        pages.getMenu().order_by_vendor.click();
        Assert.assertTrue(pages.getOrderByVendorPage().totalPrice.isDisplayed());


    }

    @Test
    public void displayActionOptionTest(){

        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Action option when clicking each product by Vendor page");
        pages.getMenu().order_by_vendor.click();


        pages.getOrderByVendorPage().vendor.click();
        pages.getOrderByVendorPage().prodcut.click();
        pages.getOrderByVendorPage().checkbox.click();
        pages.getOrderByVendorPage().actionOption.click();

        Assert.assertTrue(pages.getOrderByVendorPage().actionOption.isDisplayed());

        String  actionText=pages.getOrderByVendorPage().actionOption.getText();
        Assert.assertEquals(actionText,"Action");

    }
    @Test
    public  void displayPrintOptionTest(){
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying Action option when clicking each product by Vendor page");
        pages.getMenu().order_by_vendor.click();


        pages.getOrderByVendorPage().vendor.click();
        pages.getOrderByVendorPage().prodcut.click();
        pages.getOrderByVendorPage().checkbox.click();


        Assert.assertTrue(pages.getOrderByVendorPage().printOption.isDisplayed());
        System.out.println(pages.getOrderByVendorPage().printOption.getText());

        String  printText=pages.getOrderByVendorPage().printOption.getText();
        Assert.assertEquals(printText,"Print");

    }
    @Test
    public  void orderStatusIcon() throws InterruptedException {
        Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));

        extentLogger.info("Verifying order status icon is displaying");

        BrowserUtils.wait(5);
        pages.getMenu().order_by_vendor.click();
        BrowserUtils.wait(5);
        pages.getOrderByVendorPage().vendor.click();
        BrowserUtils.wait(5);
        pages.getOrderByVendorPage().prodcut.click();
        BrowserUtils.wait(5);
        pages.getOrderByVendorPage().checkbox.click();
        Thread.sleep(3000);

        Assert.assertTrue(pages.getOrderByVendorPage().orderStatus.isDisplayed());


    }
}
