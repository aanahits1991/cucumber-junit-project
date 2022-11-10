package com.cydeo.step_definitions;

import com.cydeo.pages.WikiSearchPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WikiSearch_StepDef {

    WikiSearchPage wikiSearchPage = new WikiSearchPage();

    @Given("user is on Wikipedia home page")
    public void user_is_on_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org/");
    }

    @When("user types Steve Jobs in the wiki search box")
    public void user_types_steve_jobs_in_the_wiki_search_box() {
        wikiSearchPage.searchBox.sendKeys("Steve Jobs");

    }

    @When("user clicks wiki search button")
    public void user_clicks_wiki_search_button() {
       wikiSearchPage.searchButton.click();
    }

    @Then("user sees Steve Jobs is in the wiki title")
    public void user_sees_steve_jobs_is_in_the_wiki_title() {
        Assert.assertTrue("Title verification is failed",Driver.getDriver().getTitle().contains("Steve Jobs"));
    }

    @When("user types {string} in the wiki search box")
    public void user_types_in_the_wiki_search_box(String searchKeyword) {
        wikiSearchPage.searchBox.sendKeys(searchKeyword);

    }
    @Then("user sees {string} is in the wiki title")
    public void user_sees_is_in_the_wiki_title(String string) {
       Assert.assertTrue(Driver.getDriver().getTitle().contains(string));
    }

    @Then("user sees {string} is in the main header")
    public void user_sees_is_in_the_main_header(String headerName) {


    }


}
