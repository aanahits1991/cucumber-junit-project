package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='ctl00_MainContent_username']")
    public WebElement userNameInputBox;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_password']")
    public WebElement passwordInputBox;

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderButton;

    @FindBy(xpath = "//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")
    public WebElement productDropdown;

    @FindBy(xpath = "//option[.='FamilyAlbum']")
    public WebElement familyAlbumOption;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']")
    public WebElement quantity;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_txtName']")
    public WebElement customerInfo;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement streetInfo;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")
    public WebElement cityInfo;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement stateInfo;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")
    public WebElement zipInfo;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_cardList_0']")
    public WebElement vizaOption;

    @FindBy(xpath = "//input[@id='ctl00_MainContent_fmwOrder_TextBox6']")
    public WebElement cardNum;

    @FindBy (id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expireDate;

    @FindBy (xpath = "//a[.='Process']")
    public WebElement processButton;
}
