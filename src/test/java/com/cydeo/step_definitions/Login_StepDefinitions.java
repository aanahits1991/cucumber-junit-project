package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

    @Given("user is on the library login page")
    public void user_is_on_the_library_login_page() {
        System.out.println("hhh");
    }
    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        System.out.println("bbb");
    }
    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("bbbbn");
    }
    @Then("user should see dashboard")
    public void user_should_see_dashboard() {
        System.out.println("hghg");

    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {

    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {

    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
    }


}
