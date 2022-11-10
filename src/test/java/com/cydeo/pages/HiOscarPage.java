package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HiOscarPage {

    public HiOscarPage(){
        PageFactory.initElements(Driver.getDriver(),this);


    }
    @FindBy (xpath = "(//span[.='Search network'])[1]")
    public WebElement searchNetworkButton;

    @FindBy(xpath = "//div[@class='fieldMessages_field__hR-R1']")
    public List<WebElement> dropDowns;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueButton;

}
