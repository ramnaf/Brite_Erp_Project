package com.briteerp.pages;
import com.briteerp.utilities.Driver;
import com.briteerp.utilities.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class LoginPage extends TestBase {

    public  LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    //TODO: Dont touch this class please !!!!!!!!!!!

    @FindBy(xpath = "html/body/div[1]/div/div[2]/a[2]")
    public WebElement demoAccount;

   @FindBy(xpath = ".//*[@id='login']")
    public WebElement email;

    @FindBy(xpath = ".//*[@id='password']")
    public WebElement password;

   @FindBy(xpath = ".//*[@id='wrapwrap']/main/div/form/div[4]/button")
    public WebElement singinButton;

   @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[1]/li[13]/a/span")
    public WebElement LucnModel;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement okButton;

    public void login(String username,String psw){

        demoAccount.click();
        email.sendKeys(username);
        password.sendKeys(psw);
        singinButton.click();
wait.until(ExpectedConditions.titleContains("nbo"));
        LucnModel.click();

        Actions actToOkButton = new Actions(Driver.getDriver());

        actToOkButton.moveToElement(okButton).perform();   // in Actions, we have to do the perform  in order to execute

        okButton.click();
    }



}
