package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Step {

    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get("http://qa2.trycloud.net/index.php/login?clear=1");

    }

    @When("user enters valid {string} and valid {string} and clicks login button")
    public void userEntersValidAndValidAndClicksLoginButton(String expectedUsername, String expectedPassword) {
        BrowserUtils.wait(3000);
        loginPage.login(expectedUsername, expectedPassword);

    }

    @Then("user should be launched at the dashboard page")
    public void user_should_be_launched_at_the_dashboard_page() {
        Assert.assertEquals("http://qa2.trycloud.net/index.php/apps/dashboard/", Driver.getDriver().getCurrentUrl());

//        Driver.getDriver().close();
    }


}
