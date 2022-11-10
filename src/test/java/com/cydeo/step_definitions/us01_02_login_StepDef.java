package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPageUS01_02;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class us01_02_login_StepDef {

    LoginPageUS01_02 loginPageUS01_02 = new LoginPageUS01_02();

    @When("user enter valid {string} and {string}")
    public void user_enter_valid_and(String username, String password) {
        Driver.getDriver().get(ConfigurationReader.getProperty("env_try"));
        loginPageUS01_02.login(username, password);

    }

    @When("user click login button")
    public void user_click_login_button() {

        BrowserUtils.clickElement(loginPageUS01_02.btn_login);
    }

    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {

        BrowserUtils.verifyTitle2("Dashboard");
    }


}
