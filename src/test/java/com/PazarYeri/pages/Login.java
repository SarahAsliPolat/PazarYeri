package com.PazarYeri.pages;

import com.PazarYeri.utilities.ConfigurationReader;
import com.PazarYeri.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(id = "inputEmail")
    private WebElement userNameInputBox;

    @FindBy(id = "inputPassword")
    private WebElement passwordInputBox;

    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // in the parameter (role) , enter either "librarian" or "student"
    public void login(String role) {
        String username = "";
        String password = "";

        if (role.equalsIgnoreCase("librarian")) {
            username = ConfigurationReader.getProperties("username");
            password = ConfigurationReader.getProperties("password");
        } else if (role.equalsIgnoreCase("student")) {
            username = ConfigurationReader.getProperties("student11");
            password = ConfigurationReader.getProperties("student11Password");
        } else {
            username = null;
            password = null;
            throw new RuntimeException("User is not found");
        }

        userNameInputBox.sendKeys(username);
        passwordInputBox.sendKeys(password, Keys.ENTER);
    }



    /*
     role = librarian , student, or a random name to login with
     invalidPassword = enter a invalid password.
             This method is overloaded for the intentions of NOT logging in.
             If you wish to login this way you can call from
                        ConfigurationReader.getProperty("password.librarian || password.student")
                        and you will successfully login if this is passed in the invalidAccountPassword
                        otherwise, just use login(String role).

     */
    public void login(String role, String invalidAccountPassword) {

        String user = "";
        String password = "";


        if(role.equalsIgnoreCase("librarian")|| role.equalsIgnoreCase("student")){
            if(role.equalsIgnoreCase("librarian")){
                user = ConfigurationReader.getProperties("username.librarian");
                password = invalidAccountPassword;
            }else if(role.equalsIgnoreCase("student")){
                user = ConfigurationReader.getProperties("username.student");
                password = invalidAccountPassword;
            }
        }else{
            user = role;
            password = invalidAccountPassword;
        }

        userNameInputBox.sendKeys(user);
        passwordInputBox.sendKeys(password, Keys.ENTER);


    }



}
