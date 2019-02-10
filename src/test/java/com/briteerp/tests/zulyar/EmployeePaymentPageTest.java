package com.briteerp.tests.zulyar;

import com.briteerp.utilities.BrowserUtils;
import com.briteerp.utilities.ConfigurationReader;
import com.briteerp.utilities.TestBase;
import org.testng.annotations.Test;

public class EmployeePaymentPageTest extends TestBase {

    @Test
    public void importButtonTest(){

        pages.login().login(ConfigurationReader.getProperty("managerUsername"),
                ConfigurationReader.getProperty("managerPassword"));


        pages.getMenu().employee_payment.click();
        BrowserUtils.wait(3);

        pages.getPaymentPage().importButton.click();
        BrowserUtils.wait(3);

        pages.getPaymentPage().loadFile.click();
        BrowserUtils.wait(3);

        String path="/Users/zulyar/Desktop/testCase.xlsx";
        BrowserUtils.uploadFile(path);

        BrowserUtils.wait(7);
    }


}
