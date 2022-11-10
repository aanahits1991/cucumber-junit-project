package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.pages.LoginPageUS01_02;
import com.cydeo.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDef {

    LoginPageUS01_02 loginPageUS01_02 = new LoginPageUS01_02();

    @When("user  log in with valid credentials")
    public void user_log_in_with_valid_credentials() {
        loginPageUS01_02.login();
    }

    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String> expectedModuleNames) {


        //   List<String> actualModuleNames = new DashboardPage().getModulesText();
        //   Assert.assertEquals(expectedModuleNames,actualModuleNames);

        Assert.assertEquals(expectedModuleNames, BrowserUtils.getElementsText(new DashboardPage().modules));

    }


}