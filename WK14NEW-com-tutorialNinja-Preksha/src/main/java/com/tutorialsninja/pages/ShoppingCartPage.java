package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    By shoppingcarttext = By.xpath("//div[@id='content']/h1");
    By product = By.xpath("//div[@class='table-responsive']/table/tbody[1]/tr[1]/td[2]/a");
    By deliverydate = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[2]/small[1]");
    By model = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[3]");
    By total = By.xpath("//div[@class='table-responsive']/table/tbody/tr/td[6]");
    By macshoppingcarttext =By.xpath("//div[@id='checkout-cart']/div/div/h1");
    By macbookquantitybox = By.xpath("//div[@class='input-group btn-block']/input");
    By updatemacbook = By.xpath("//button[@type='submit']/i");
    By clickoncheckout = By.xpath("//div[@id='content']/div[3]/div[2]/a");
    By verifyshoppingcartcheckout =By.xpath("//div[@id='content']/h1");
    By newcustomer = By.xpath("//div[@class='panel-body']/div/div/h2");
    By guestbutton =By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input");
    public String getverifyshoppingcart (){
        return getTextFromElement(shoppingcarttext);
    }
    public String getproduct(){
        return getTextFromElement(product);
    }
    public String getdeliverydate (){
        return getTextFromElement(deliverydate);
    }
    public String getmodel (){
        return getTextFromElement(model);
    }
    public String gettotal (){
        return getTextFromElement(total);
    }
    public String getmacshoppingcarttext (){
        return getTextFromElement(macshoppingcarttext);
    }
    public void getnewmacbookqt (){
        clearfield(macbookquantitybox);
        sendTextToElement(macbookquantitybox,"2");
    }
    public void clickonupdate (){
        clickOnElement(updatemacbook);
    }
    public void clickoncheckout(){
        clickOnElement(clickoncheckout);
    }
    public String verifycheckouttext(){
        return getTextFromElement(verifyshoppingcartcheckout);

    }
    public String verifynewcustomer(){
        return getTextFromElement(newcustomer);
    }
    public void clickonguestbutton(){
        clickOnElement(guestbutton);
    }








}
