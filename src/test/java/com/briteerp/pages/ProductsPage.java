package com.briteerp.pages;

import com.briteerp.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
    public ProductsPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TODO: Write you Page Object Model below
}
