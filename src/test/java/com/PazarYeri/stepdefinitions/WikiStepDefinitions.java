package com.PazarYeri.stepdefinitions;

import com.PazarYeri.pages.WikiSearchPage;
import com.PazarYeri.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WikiStepDefinitions {
    WikiSearchPage wikiSearchPage = new WikiSearchPage();


    @Given("User is on the etsy Wikipedia home page")
    public void user_is_on_the_etsy_wikipedia_home_page() {
        Driver.getDriver().get("https://www.wikipedia.org");

    }


    @When("User search {string} in the wiki search page")
    public void user_search_in_the_wiki_search_page(String string) {

    }
    @Then("User should see {string} in the wiki title")
    public void user_should_see_in_the_wiki_title(String string) {

    }


}
