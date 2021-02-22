package com.PazarYeri.pages;

import com.PazarYeri.utilities.ConfigurationReader;
import com.PazarYeri.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
    public OrderPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;
    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;
    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderModule;

    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement myMoneyBox;
    @FindBy (id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantityBox;

    @FindBy (id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;
    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_0")
    public WebElement visa;

    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_1")
    public WebElement Master;

    @FindBy (id = "ctl00_MainContent_fmwOrder_cardList_2")
    public WebElement American;




    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement CardNumber;



    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement ExpiredDate;




    @FindBy (id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement ProcessButton;


@FindBy(xpath = "//strong")
public WebElement verifyMessage;


    public void selectCard(String card){
        switch (card){
            case "Visa":
                visa.click();
                break;
            case "MaterCard":
                Master.click();
                break;
            case "AmericanExpress":
                American.click();
                break;

            default:
                throw new RuntimeException("No such Credit Card");
        } }




    public void loginSmartBear() {
        usernameBox.sendKeys(ConfigurationReader.getProperties("smartBearUserName"));
        passwordBox.sendKeys(ConfigurationReader.getProperties("smartbearPassword") + Keys.ENTER);

    }


}