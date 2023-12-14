package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class ComponentPage extends Utility {
    By componentLink = By.xpath("//ul[@class='nav navbar-nav']/li[3]");
    By allComponentLink = By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");
    By componentText = By.xpath("//div[@id='content']/h2");

    public void clickOnComponentLink(){
        clickOnElement(componentLink);
    }
    public void clickOnAllComponentLink(){
        clickOnElement(allComponentLink);
    }
    public String getComponentText(){
        return getTextFromElement(componentText);

    }

}
