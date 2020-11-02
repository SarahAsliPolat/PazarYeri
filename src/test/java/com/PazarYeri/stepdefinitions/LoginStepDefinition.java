package com.PazarYeri.stepdefinitions;

import com.PazarYeri.pages.Login;
import com.PazarYeri.utilities.ConfigurationReader;
import com.PazarYeri.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {

    Login loginPage = new Login();

    @Given("user is on the Home Page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties(("libraryUrl")));
    }

    @When("user logs in as a librarian")
    public void user_logs_in_as_a_librarian() throws InterruptedException {
        Thread.sleep(3);
        loginPage.login();
    }

    @Then("user should be able to see dashboard page")
    public void user_should_be_able_to_see_dashboard_page() throws InterruptedException {
//        String actualResult= Driver.getDriver().getTitle();
//        String expectedResult = "Library";
//
//        Assert.assertEquals("Actual result is not the same with expected result", expectedResult, actualResult);
        Thread.sleep(2000);
       // Assert.assertTrue(loginPage.pageTitle.isDisplayed());
    }

}
