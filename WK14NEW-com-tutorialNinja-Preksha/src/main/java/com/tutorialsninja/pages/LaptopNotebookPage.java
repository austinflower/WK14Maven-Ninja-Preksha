package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class LaptopNotebookPage extends Utility {

    By lapnotelink = By.xpath("//ul[@class='nav navbar-nav']/li[2]");
    By showalllapnotelink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a");
    By getShowalllapnotelineTEXT = By.xpath("//div[@id='content']/h2");
    By sortvalue = By.id("input-sort");
    By verifyHL = By.xpath("//select[@id='input-sort']/option[5]");
    By macbook = By.xpath("//div[@id='content']/div[4]/div[4]/div/div[2]/div/h4/a");


    public void clickonlapnotelink(){
        clickOnElement(lapnotelink);
        clickOnElement(showalllapnotelink);
    }
    public void clickOnshowalllapnotelink(){
        clickOnElement(showalllapnotelink);
    }
    public String getshowalllapnoteTEXT(){
        return getTextFromElement(getShowalllapnotelineTEXT);}
    public void getsortvalue(){
        selectByVisibleTextFromDropDown(sortvalue,"Price (High > Low)");
    }
    public String getverifyHL (){
        return getTextFromElement(verifyHL);

    }
    public void selectmacbook(){
        clickOnElement(macbook);
    }
}
