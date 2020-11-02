package com.PazarYeri.stepdefinitions;


import com.PazarYeri.pages.Login;
import com.PazarYeri.utilities.BrowserUtils;
import com.PazarYeri.utilities.ConfigurationReader;
import com.PazarYeri.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefinition {

  /*  Login loginPage = new Login();

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
*/
  Login loginPage = new Login();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties(("libraryUrl")));
    }


    @When("user logs in")
    public void user_logs_in() throws InterruptedException {
     Thread.sleep(3000);
      loginPage.login("librarian");
    }
    @Then("user should see home page")
    public void user_should_see_home_page() {
        BrowserUtils.wait(3);
       // WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
       // wait.until(ExpectedConditions.titleIs("http://library2.cybertekschool.com/#dashboard"));
        String actual=Driver.getDriver().getCurrentUrl().toLowerCase();
        BrowserUtils.wait(3);
        String expectedResult="dashboard";
        Assert.assertTrue(actual.contains(expectedResult));

    }
}
