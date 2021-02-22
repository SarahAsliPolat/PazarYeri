package com.PazarYeri.pages;

import com.PazarYeri.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class WikiSearchPage {

    public WikiSearchPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
