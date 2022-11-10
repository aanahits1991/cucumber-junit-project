package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTableLoginPages {
    public WebTableLoginPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usernameInputButton;


    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordInputButton;

    @FindBy(xpath = "//button[.='Login']")
    public WebElement loginButton;

    /**
     *
     * @param username
     * @param password
     */
    public void login(String username, String password){
        usernameInputButton.sendKeys(username);
        passwordInputButton.sendKeys(password);
        loginButton.click();
    }

}
