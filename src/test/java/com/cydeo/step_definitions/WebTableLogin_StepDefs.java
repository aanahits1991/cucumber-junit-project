package com.cydeo.step_definitions;

import com.cydeo.pages.WebTableLoginPages;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLogin_StepDefs {

    WebTableLoginPages webTablePages = new WebTableLoginPages();

    @Given("user is on the login page of web table app")
    public void user_is_on_the_login_page_of_web_table_app() {
        Driver.getDriver().get("https://web-table-2.cydeo.com/login");
    }

    @When("user enters username {string}")
    public void user_enters_username(String string) {
        webTablePages.usernameInputButton.sendKeys(string);
    }

    @When("user enters password {string}")
    public void user_enters_password(String string) {
        webTablePages.passwordInputButton.sendKeys(string);
    }

    @When("user clicks to login button")
    public void user_clicks_to_login_button() {
        webTablePages.loginButton.click();
    }

    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @When("user enters username {string} password {string} and logins")
    public void userEntersUsernamePasswordAndLogins(String userName, String password) {
//        webTablePages.usernameInputButton.sendKeys(userName);
//        webTablePages.usernameInputButton.sendKeys(password);
//        webTablePages.loginButton.click();

        webTablePages.login(userName, password);
    }

    @When("user enters below credentials")
    public void userEntersBelowCredentials(Map<String, String> credentials) {
     //  webTablePages.usernameInputButton.sendKeys(credentials.get("username"));
        webTablePages.login(credentials.get("username"),credentials.get("password"));
    }
}
