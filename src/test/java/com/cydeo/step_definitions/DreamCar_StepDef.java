package com.cydeo.step_definitions;

import com.cydeo.pages.DreamCarPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class DreamCar_StepDef {
    Select select;
    DreamCarPage dreamCarPage = new DreamCarPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

    @Given("user on the main page")
    public void user_on_the_main_page() {
        Driver.getDriver().get("https://www.cars.com/");
    }

    @When("user clicks {string} option")
    public void user_clicks_option(String expectedMenuName) throws InterruptedException {

        WebElement navMenuItem = Driver.getDriver().findElement(By.xpath("//ul[@class='header-links']//a[.='" + expectedMenuName + "']"));
        wait.until(ExpectedConditions.elementToBeClickable(navMenuItem));
        navMenuItem.click();

    }

    @When("user clicks New_used label and selects {string} option")
    public void user_clicks_new_used_label_and_selects_option(String expectedOption) {
//        Driver.getDriver().switchTo().frame(dreamCarPage.Iframe);

//        Driver.getDriver().switchTo().frame(dreamCarPage.Iframe);
//      Select select = new Select(dreamCarPage.newUsedLabel);
        //  dreamCarPage.newUsedLabel.click();
        select = new Select(dreamCarPage.newUsedLabel);
        select.selectByVisibleText(expectedOption);
    }


    @When("user selects {string} from Make label")
    public void user_selects_from_make_label(String expectedMake) {
        select = new Select(dreamCarPage.makeLabel);
        dreamCarPage.makeLabel.click();
        select.selectByVisibleText(expectedMake);


    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {

        dreamCarPage.searchButton.click();
        wait.until(ExpectedConditions.invisibilityOf(dreamCarPage.searchButton));
    }

    @Then("user should see {string} header")
    public void user_should_see_header(String expectedHeader) {
        WebElement actualHeader = dreamCarPage.header;
        Assert.assertTrue(actualHeader.isDisplayed());
        Assert.assertEquals(expectedHeader, actualHeader.getText());

    }

    @When("user clicks on grow with cars link")
    public void user_clicks_on_grow_with_cars_link() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", dreamCarPage.growWithCarsLink);
        dreamCarPage.growWithCarsLink.click();
        Thread.sleep(7000);
    }


    @Then("verify Grow With Cars page header is displayed")
    public void verify_grow_with_cars_page_header_is_displayed(List<String> expectedHeaders) throws InterruptedException {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", dreamCarPage.growWithCarsLink);
        dreamCarPage.growWithCarsLink.click();
        Thread.sleep(2000);


        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        Thread.sleep(2000);
        List<String> listOfWindowHandles = new ArrayList<>(windowHandles);
        System.out.println("listOfWindowHandles.size() = " + listOfWindowHandles.size());
        Driver.getDriver().switchTo().window(listOfWindowHandles.get(1));
        Thread.sleep(2000);
        System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
        List<WebElement> actualHeaders = Driver.getDriver().findElements(By.xpath("//h2[@class]"));

        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertTrue(actualHeaders.get(i).isDisplayed());
            Assert.assertEquals(expectedHeaders.get(i), actualHeaders.get(i).getText());
            System.out.println("actualHeaders.get(i).getText() = " + actualHeaders.get(i).getText());
        }


        Thread.sleep(2000);
        Driver.getDriver().switchTo().window(listOfWindowHandles.get(0));
        Assert.assertEquals("https://www.cars.com/", Driver.getDriver().getCurrentUrl());


        List<WebElement> allLinks = Driver.getDriver().findElements(By.xpath("//footer[@id='global-footer']//a"));
        System.out.println("allLinks.size() = " + allLinks.size());


        List<WebElement> headers;

        for (int i = 0; i < allLinks.size(); i++) {
            allLinks.get(i).click();
            Set<String> windowHandles1 = Driver.getDriver().getWindowHandles();
            List<String> windows = new ArrayList<>(windowHandles1);

            if (windowHandles1.size() > 1) {

                Driver.getDriver().switchTo().window(windows.get(1));
                headers = Driver.getDriver().findElements(By.xpath("//header//h1[@class]"));
                Assert.assertEquals("Let’s Grow Your Dealership ROI | GrowWithCars.com", Driver.getDriver().getTitle());
                Driver.getDriver().switchTo().window(windows.get(0));

            } else {
                headers = Driver.getDriver().findElements(By.xpath("//header//h1[@class]"));

                Assert.assertEquals("New Cars, Used Cars, Car Dealers, Prices & Reviews | Cars.com", Driver.getDriver().getTitle());
                Driver.getDriver().navigate().back();


            }


//            for (int j = 0; j < headers.size(); j++) {
//                Assert.assertTrue(headers.get(j).isDisplayed());
//            }
//            Thread.sleep(3000);
//            System.out.println("Driver.getDriver().getCurrentUrl() = " + Driver.getDriver().getCurrentUrl());
//            Driver.getDriver().navigate().back();
//            allLinks = Driver.getDriver().findElements(By.xpath("//footer[@id='global-footer']//a"));
//            Thread.sleep(3000);
//
//            if (!Driver.getDriver().equals(listOfWindowHandles.get(0))) {
//                Driver.getDriver().switchTo().window(listOfWindowHandles.get(0));
//            }


        }

    }


    @Then("user clicks on each link {string} and verifies page header {string} is displayed in the opened page")
    public void user_clicks_on_each_link_and_verifies_page_header_is_displayed_in_the_opened_page(String expectedLink, String expectedURL) {
        expectedURL= ConfigurationReader.getProperty("startOfUrl") + expectedURL;
        WebElement actualLink = Driver.getDriver().findElement(By.xpath("//footer//li//a[.='" + expectedLink + "']"));
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", actualLink);
        actualLink.click();
        BrowserUtils.wait(3000);

        Set<String> windowHandlesSet = Driver.getDriver().getWindowHandles();
        List<String> windowHandlesList = new ArrayList<>(windowHandlesSet);
        if (windowHandlesSet.size() == 2) {
            Driver.getDriver().switchTo().window(windowHandlesList.get(1));
            String actualURL = Driver.getDriver().getCurrentUrl();
            Assert.assertTrue(actualURL.contains(expectedURL));

        }
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualURL.contains(expectedURL));


    }

}