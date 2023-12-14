package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By loginLink = By.className("ico-login");
    By desktopLink = By.xpath("//ul[@class='nav navbar-nav']/li[1]");
    By showalldesktop = By.xpath("//ul[@class='nav navbar-nav']/li[1]/div/a");
    By desktopText = By.xpath("//div[@id='content']/h2");
    By sortByDeskTop = By.id("input-sort");
    By sortZA= By.xpath("//select[@id='input-sort']/option[3]");
    By sortAZ = By.xpath("//select[@id='input-sort']/option[2]");
    By selectHP = By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]/div/div/a");
    By verifyHP = By.xpath("//div[@id='content']/div/div[2]/h1");
    By lapnotelink = By.xpath("//ul[@class='nav navbar-nav']/li[2]");
    By showalllapnotelink = By.xpath("//ul[@class='nav navbar-nav']/li[2]/div/a");
    By component =By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");
    By showAllComponent= By.xpath("//ul[@class='nav navbar-nav']/li[3]/div/a");
   public void clickOnLoginLink(){clickOnElement(loginLink);  }
   public void clickonDesktoplink() {
       clickOnElement(desktopLink);
       clickOnElement(showalldesktop);
   }
    public void clickonlapnotelink(){
        clickOnElement(lapnotelink);
        clickOnElement(showalllapnotelink);
    }
    public void clickOnComponentLink(){
       clickOnElement(component);
       clickOnElement(showAllComponent);
    }



    public void clickOnSortByDeskTop(){ clickOnElement(sortByDeskTop);    }
    public String getDesktopText(){  return getTextFromElement(desktopText);    }
    public void alpaOrder(){
       //selectByIndexFromDropDown(sortByDeskTop, 2);
       selectByVisibleTextFromDropDown(sortByDeskTop, "Name (A - Z)");
   }
    public String getSortZA(){ return getTextFromElement(sortZA);    }
    public String getSortAZ(){ return getTextFromElement(sortAZ);}
    public void clickOnSelectHP(){ clickOnElement(selectHP);}
    public String clickOnVerifyHP (){ return getTextFromElement(verifyHP);}

}
