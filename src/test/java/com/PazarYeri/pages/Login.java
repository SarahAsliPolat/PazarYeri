package com.PazarYeri.pages;

import com.PazarYeri.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {
    //To not use web elements directly in step definition classes
    //helps to prevent code duplication and keep step definitions clean
    @FindBy(id = "prependedInput")
    private WebElement username;

    @FindBy(id = "prependedInput2")
    private WebElement password;

    @FindBy(css = "[class='alert alert-error']")
    private WebElement warningMessage;

    public String getWarningMessageTest() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return warningMessage.getText().trim();
    }

    public void login(String usernameValue, String passwordValue) {
        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login() {
        String usernameValue = ConfigurationReader.getProperties("storemanager.username");
        String passwordValue = ConfigurationReader.getProperties("password");

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

    public void login(String role) {
        String usernameValue = "";
        String passwordValue = ConfigurationReader.getProperties("password");

        if (role.equalsIgnoreCase("sales manager")) {
            usernameValue = ConfigurationReader.getProperties("salesmanager.username");
        } else if (role.equalsIgnoreCase("driver")) {
            usernameValue = ConfigurationReader.getProperties("driver.username");
        } else {
            usernameValue = ConfigurationReader.getProperties("storemanager.username");
        }

        username.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }

}
