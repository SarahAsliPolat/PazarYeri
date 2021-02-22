package com.PazarYeri.stepdefinitions;

import com.PazarYeri.pages.EtsySearchPage;
import com.PazarYeri.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsyStepDefinitions {

    EtsySearchPage etsySearchPage = new EtsySearchPage();


    @Given("User is on the etsy home page")
    public void user_is_on_the_etsy_home_page() {
        Driver.getDriver().get("//https://www.etsy.com");

    }




    @Then("User should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String actualTitle = Driver.getDriver().getTitle();
        String expextedTitle="Etsy - Shop for handmade, vintage,custom, and unique gifts for everyone";

        Assert.assertEquals(actualTitle,expextedTitle);

    }


    @When("User searches {string}in the search box")
    public void userSearchesInTheSearchBox(String serachValue) {
        etsySearchPage.searchBox.sendKeys(serachValue);


    }

    @And("User click search button")
    public void userClickSearchButton() {
        etsySearchPage.searchButton.click();

    }

    @Then("User should see {string} in the Etsy title")
    public void userShouldSeeIntTheEtsyTitle(String expectedInTitle) {

        String acualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(acualTitle.contains(expectedInTitle));


    }
}
