package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.pages.GoogleSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class GoogleSearch_StepDefinitions {

EtsySearchPage etsySearchPage = new EtsySearchPage();
    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Given("user is on Google search page")
    public void user_is_on_google_search_page() {
        Driver.getDriver().get("https://www.google.com");
    }
    @When("user types apple in the google search box and clicks enter")
    public void user_types_apple_in_the_google_search_box_and_clicks_enter() {
       googleSearchPage.searchBox.sendKeys("apple" + Keys.ENTER);
    }
    @Then("user sees apple – Google Search is in the google title")
    public void user_sees_apple_google_search_is_in_the_google_title() {

        String expectedTitle = "apple - Google Search";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals("Title verification is failed!", expectedTitle,actualTitle);
    }

    @When("user types {string} in the google search box and clicks enter")
    public void user_types_in_the_google_search_box_and_clicks_enter(String searchKeyword) {

        googleSearchPage.searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }


    @Then("user sees {string} is in the google title")
    public void user_sees_is_in_the_google_title(String expectedTitle) {  // comming from feature file expectedTitle
       String actualTitle = Driver.getDriver().getTitle();
       Assert.assertEquals(expectedTitle,actualTitle);

    }

//    @Given("user is on https:\\/\\/www.etsy.com")
//    public void user_is_on_https_www_etsy_com() {
//       Driver.getDriver().get("https://www.etsy.com");
//
//    }

    @Given("user is on https:\\/\\/www.etsy.com")
    public void user_is_on_https_www_etsy_com() {
        Driver.getDriver().get("https://www.etsy.com");
    }
    @Then("user sees title is Expected: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone")
    public void user_sees_title_is_expected_etsy_shop_for_handmade_vintage_custom_and_unique_gifts_for_everyone() {
       Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Driver.getDriver().getTitle());
    }

    @When("user types {string} in the search box")
    public void user_types_in_the_search_box(String expectedRes) {
       etsySearchPage.searchBoxBtn.sendKeys(expectedRes);
    }
    @When("user clicks search button")
    public void user_clicks_search_button() {
       etsySearchPage.searchButton.click();
    }
    @Then("user sees {string} is in the title")
    public void user_sees_is_in_the_title(String result) {
        Assert.assertEquals(result,Driver.getDriver().getTitle());

    }



}
