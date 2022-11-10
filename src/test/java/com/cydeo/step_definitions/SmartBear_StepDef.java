package com.cydeo.step_definitions;

import com.cydeo.pages.SmartBearPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDef {

    SmartBearPage smartBearPage = new SmartBearPage();

    @Given("user is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        smartBearPage.userNameInputBox.sendKeys("Tester");
        smartBearPage.passwordInputBox.sendKeys("test");
        smartBearPage.loginButton.click();
        smartBearPage.orderButton.click();
    }

    @When("user fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {

    }

    @When("user selects FamilyAlbum from product dropdown")
    public void user_selects_family_album_from_product_dropdown() {
        Select select = new Select(smartBearPage.productDropdown);
        select.selectByValue("FamilyAlbum");

    }

    @When("user enters {string} to quantity")
    public void user_enters_to_quantity(String string) {

        smartBearPage.quantity.sendKeys(string);
    }

    @When("user enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        smartBearPage.customerInfo.sendKeys(string);
    }

    @When("user enters {string} to street")
    public void user_enters_to_street(String string) {
        smartBearPage.streetInfo.sendKeys(string);
    }

    @When("user enters {string} to city")
    public void user_enters_to_city(String string) {
        smartBearPage.cityInfo.sendKeys(string);
    }

    @When("user enters {string} to state")
    public void user_enters_to_state(String string) {
        smartBearPage.stateInfo.sendKeys(string);
    }

    @When("user enters {string}")
    public void user_enters(String string) {
        smartBearPage.zipInfo.sendKeys(string);
    }

    @When("user selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        smartBearPage.vizaOption.click();
    }

    @When("user enters {string} to card number")
    public void user_enters_to_card_number(String string) {
       smartBearPage.cardNum.sendKeys(string);
    }

    @When("user enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {
        smartBearPage.expireDate.sendKeys(string);
    }

    @When("user clicks process button")
    public void user_clicks_process_button() {
       smartBearPage.processButton.click();
    }

    @Then("user verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
