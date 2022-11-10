package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPageUS01_02;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilesStepDef {

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        new LoginPageUS01_02().login();
    }

    @When("user clicks {string} module")
    public void user_clicks_module(String string) {


    }

    @When("user click the top left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {


    }

    @Then("verify all the files are sel")
    public void verify_all_the_files_are_sel() {


    }


    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
