package com.cydeo.step_definitions;

import com.cydeo.pages.BasePage;
import com.cydeo.pages.ViewAllOrdersPage;
import com.cydeo.pages.WebTabLeOrderPage;
import com.cydeo.pages.WebTableLoginPages;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebTableOrder_StepDefs {

    WebTableLoginPages webTableLoginPages = new WebTableLoginPages();
    BasePage basePage = new BasePage();

    WebTabLeOrderPage webTabLeOrderPage = new WebTabLeOrderPage();

    ViewAllOrdersPage viewAllOrdersPage = new ViewAllOrdersPage();
    Select select;

    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        webTableLoginPages.login(ConfigurationReader.getProperty("username"), ConfigurationReader.getProperty("password"));
        basePage.navItemButton3.click();
    }

    @When("user selects product type {string}")
    public void user_selects_product_type(String expectedProductType) {

        select = new Select(webTabLeOrderPage.productTypeDropdown);
        select.selectByVisibleText(expectedProductType);

    }

    @When("user enters quantity {int}")
    public void user_enters_quantity(Integer expectedQuantity) {
        // webTabLeOrderPage.inputQuantity.clear();
        webTabLeOrderPage.inputQuantity.sendKeys(Keys.BACK_SPACE);
        webTabLeOrderPage.inputQuantity.sendKeys(expectedQuantity + "");

    }

    @When("user enters customer name {string}")
    public void user_enters_customer_name(String string) {
        webTabLeOrderPage.inputName.sendKeys(string);

    }

    @When("user enters street {string}")
    public void user_enters_street(String string) {
        webTabLeOrderPage.inputStreet.sendKeys(string);
    }

    @When("user enters city {string}")
    public void user_enters_city(String string) {
        webTabLeOrderPage.inputCity.sendKeys(string);
    }

    @When("user enters state {string}")
    public void user_enters_state(String string) {
        webTabLeOrderPage.inputState.sendKeys(string);
    }

    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String string) {
        webTabLeOrderPage.inputZip.sendKeys(string);
    }

    @When("user selects credit card type {string}")
    public void user_selects_credit_card_type(String string) {

//        for (WebElement each : webTabLeOrderPage.cardType) {
//            if (each.getAttribute("value").equalsIgnoreCase(string)) {
//                each.click();
//            }
//        }

        BrowserUtils.clickRadioButton(webTabLeOrderPage.cardType, string);
    }

    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String string) {
webTabLeOrderPage.inputCardNo.sendKeys(string);
    }

    @When("user enters expiry date {string}")
    public void user_enters_expiry_date(String string) {
        webTabLeOrderPage.inputCardExp.sendKeys(string);
    }

    @When("user enters process order button")
    public void user_enters_process_order_button() {
       webTabLeOrderPage.processOrderButton.click();
    }

    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedCustomerName) {

        String actualCustomerName = viewAllOrdersPage.newCustomerCell.getText();

        Assert.assertEquals(expectedCustomerName,actualCustomerName);
    }

}
