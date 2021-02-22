package com.PazarYeri.stepdefinitions;

import com.PazarYeri.pages.OrderPage;
import com.PazarYeri.utilities.BrowserUtils;
import com.PazarYeri.utilities.ConfigurationReader;
import com.PazarYeri.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class SmartBearLoginStepDefinitions {
    OrderPage orderPage=new OrderPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperties("smartbearUrl"));
        orderPage.loginSmartBear();
        orderPage.orderModule.click();
        BrowserUtils.wait(1);
    }
    @Given("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String string) {
       // BrowserUtils.wait(5);
        Select select= new Select(orderPage.myMoneyBox);
        BrowserUtils.waitForVisibility(orderPage.myMoneyBox,5);
        select.selectByVisibleText(string);
        BrowserUtils.wait(5);
    }
    @Given("User enters {string} to quantity")
    public void user_enters_to_quantity(String string) {
        orderPage.quantityBox.sendKeys(string);


    }
    @Given("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String string) {
        orderPage.customerName.sendKeys(string);


    }
    @Given("User enters {string} to street")
    public void user_enters_to_street(String string) {
        orderPage.street.sendKeys(string);
    }
    @Given("User enters {string} to city")
    public void user_enters_to_city(String string) {

        orderPage.city.sendKeys(string);
        BrowserUtils.wait(5);
    }
    @Given("User enters {string} to stateAnd User enters {string} to zip")
    public void user_enters_to_state_and_user_enters_to_zip(String string, String string2) {
        orderPage.state.sendKeys(string);
        BrowserUtils.wait(5);
        orderPage.zipCode.sendKeys(string2);


    }
    @Given("User selects {string} as card type")
    public void user_selects_as_card_type(String string) {
        BrowserUtils.wait(5);
        orderPage.selectCard(string);



    }
    @Given("User enters {string} to card number")
    public void user_enters_to_card_number(String string) {
        BrowserUtils.wait(5);
        orderPage.CardNumber.sendKeys(string);
    }
    @Given("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String string) {

        orderPage.ExpiredDate.sendKeys(string);

    }
    @Given("User clicks process button")
    public void user_clicks_process_button() {
        BrowserUtils.wait(5);
        orderPage.ProcessButton.click();
    }
    @Given("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String string) {
        BrowserUtils.wait(5);
     //   Assert.assertTrue("Verification Faileed!!",orderPage.verifyMessage.isDisplayed());
        Assert.assertEquals("Verification Faileed!!",string,orderPage.verifyMessage.getText());


    }

}
