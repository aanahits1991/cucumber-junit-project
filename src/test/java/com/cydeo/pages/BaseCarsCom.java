package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BaseCarsCom {
    public BaseCarsCom(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button//span[@class='nav-user-name']")
    public WebElement menuIcon;




}
