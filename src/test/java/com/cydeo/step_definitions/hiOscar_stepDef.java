package com.cydeo.step_definitions;

import com.cydeo.pages.HiOscarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class hiOscar_stepDef {

    HiOscarPage hiOscarPage = new HiOscarPage();

    @Given("user goes to hiOscar homepage")
    public void user_goes_to_hi_oscar_homepage() {

        Driver.getDriver().get(ConfigurationReader.getProperty("hiOscarEnv"));
    }

    @Given("user clicks Search network")
    public void user_clicks_search_network() {

        hiOscarPage.searchNetworkButton.click();
        BrowserUtils.wait(1000);
    }

    @Given("user from Coverage year dropdown Selects {string} option")
    public void user_from_coverage_year_dropdown_selects_option(String year) {

        hiOscarPage.dropDowns.get(0).click();
        BrowserUtils.wait(2000);
        WebElement yearOption = Driver.getDriver().findElement(By.xpath("//div[@aria-label='" + year + "']"));
        yearOption.click();


    }

    @Given("user from Coverage access dropdown Selects {string} option")
    public void user_from_coverage_access_dropdown_selects_option(String expectedResult) {
        hiOscarPage.dropDowns.get(1).click();
        BrowserUtils.wait(2000);
        WebElement employerProvided = Driver.getDriver().findElement(By.xpath("//div[@aria-label='" + expectedResult + "']"));
        employerProvided.click();
    }

    @Given("user from Network partner dropdown Selects {string} option")
    public void user_from_network_partner_dropdown_selects_option(String expectedResult) {
        hiOscarPage.dropDowns.get(2).click();
        BrowserUtils.wait(2000);
        WebElement oscarOption = Driver.getDriver().findElement(By.xpath("//div[@aria-label='" + expectedResult + "']"));
        oscarOption.click();


    }

    @Given("user from Coverage area dropdown Selects {string}")
    public void user_from_coverage_area_dropdown_selects(String expectedResult) {
        hiOscarPage.dropDowns.get(3).click();
        BrowserUtils.wait(2000);
        WebElement NJOption = Driver.getDriver().findElement(By.xpath("//div[@aria-label='" + expectedResult + "']"));
       NJOption.click();
    }

    @Given("user clicks Continue button")
    public void user_clicks_continue_button() {
      hiOscarPage.continueButton.click();
        BrowserUtils.wait(2000);
    }

    @Then("user verifies title contains {string}")
    public void user_verifies_title_contains(String expectedResult) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(expectedResult));
    }



}
