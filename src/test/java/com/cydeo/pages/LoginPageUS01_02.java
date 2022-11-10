package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageUS01_02 {

    public LoginPageUS01_02(){
        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy (id = "user")
    public WebElement txt_username;

    @FindBy (id = "password")
    public WebElement txt_password;

    @FindBy (id = "submit-form")
    public WebElement btn_login;



    public void login(String username, String password) {
        txt_username.sendKeys(username);
        txt_password.sendKeys(password);
        btn_login.click();
    }


    public void login(){
        login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
    }

}
