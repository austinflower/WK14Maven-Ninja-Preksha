package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;


public class HPLP3065page extends Utility {
    By HPLP3065page = By.xpath("//div[@id='content']/div/div[2]/h1");

    By pickDeliveryDate = By.id("input-option225");
    By qtField = By.id("input-quantity");
    By addToCart =By.id("button-cart");
    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingcartmsglink = By.xpath("//div[@class='alert alert-success alert-dismissible']/a[2]");
    public String verifyHPLP3065(){ return getTextFromElement (HPLP3065page); }

   public void selectDeliveryDate(){
        clearfield(pickDeliveryDate);

        sendTextToElement(pickDeliveryDate, "2022-11-30");
    }
    public void enterQTy(){
        clearfield(qtField);
        sendTextToElement(qtField,"1");

    }
        public void clickoncart(){
        clickOnElement(addToCart);
        }
    public String getShoppingCartText(){
        return getTextFromElement(successMessage);
    }
        public void clickonshoppingcartmsg (){
        clickOnElement(shoppingcartmsglink);
        }







}

