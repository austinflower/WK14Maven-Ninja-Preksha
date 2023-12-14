package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class MacBookPage extends Utility {
    By macbookname = By.xpath("//div[@id='content']/div/div[2]/h1");

    public String verifymacbook(){
        return getTextFromElement(macbookname);
    }
}
