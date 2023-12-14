package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class DeskTopPage extends Utility {
    By desktopText = By.xpath("//div[@id='content']/h2");
    By sortByDeskTop = By.id("input-sort");
    By verifyAllProducts = By.xpath("//div[@id='\"content\"])div[4]/div");
    By sortZA= By.xpath("//select[@id='input-sort']/option[3]");
    By sortAZ = By.xpath("//select[@id='input-sort']/option[2]");
    By selectHP = By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]/div/div/a");

    public void clickOnSortByDeskTop(){clickOnElement(sortByDeskTop);}
    public String getDesktopText(){  return getTextFromElement(desktopText);    }
    public void alpaOrder(){ selectByIndexFromDropDown(sortByDeskTop, 2);    }
    public String getSortZA(){ return getTextFromElement(sortZA);    }
    public String getSortAZ(){ return getTextFromElement(sortAZ);}
    public void clickOnSelectHP(){ clickOnElement(selectHP);}
}
