package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DreamCarPage extends BaseCarsCom {


    @FindBy(xpath = "(//a[.='Cars for Sale'])[1]")
    public WebElement carsForSaleBtn;

    @FindBy(xpath = "//div[@class='sds-home-search']")
    public WebElement Iframe;
    @FindBy(id = "make-model-search-stocktype")
    public WebElement newUsedLabel;

    @FindBy(id = "makes")
    public WebElement makeLabel;

    @FindBy(xpath = "//button[@data-searchtype='make']")
    public WebElement searchButton;

    @FindBy(xpath = "//h1[.='New and used Tesla for sale']")
    public WebElement header;

    @FindBy(xpath = "//footer[@id='global-footer']//a[.='Grow with CARS']")
    public WebElement growWithCarsLink;

    @FindBy(xpath = "//h2[@class]")
    public List<WebElement> growWithCarsPageHeaders;

    @FindBy(xpath = "//footer[@id='global-footer']//a[.='Find a Car']" )
    public List<WebElement> AllLinks;
}
