package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsNotebookTest extends TestBase {
    HomePage homePage = new HomePage();
    LaptopNotebookPage laptopNotebookPage = new LaptopNotebookPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    MacBookPage macBookPage = new MacBookPage();
    HPLP3065page hplp3065page =new HPLP3065page();
    CheckOutPage checkOutPage =new CheckOutPage();
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        homePage.clickonlapnotelink();
        laptopNotebookPage.getsortvalue();

        String actualhl = laptopNotebookPage.getverifyHL();
        String expedhl= "Price (High > Low)";
        Assert.assertEquals(actualhl,expedhl);
    }
    @Test
    public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {
        homePage.clickonlapnotelink();
        laptopNotebookPage.getsortvalue();

        String actualhl = laptopNotebookPage.getverifyHL();
        String expedhl= "Price (High > Low)";
        Assert.assertEquals(actualhl,expedhl);
        //2.4 Select Product “MacBook”
        laptopNotebookPage.selectmacbook();
        //2.5 Verify the text “MacBook”
        String actualmacbook = macBookPage.verifymacbook();
        String expectedmacbook = "MacBook";
        Assert.assertEquals(actualmacbook,expectedmacbook);
        //2.6 Click on ‘Add To Cart’ button
        hplp3065page.clickoncart();
        //2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
        hplp3065page.getShoppingCartText();
        //2.8 Click on link “shopping cart” display into success message
        hplp3065page.clickonshoppingcartmsg();
        //2.9 Verify the text "Shopping Cart"
        String actualmactext = shoppingCartPage.getmacshoppingcarttext();
        String expectedmactext = "Shopping Cart  (0.00kg)";
        Assert.assertEquals(actualmactext,expectedmactext);
        //2.10 Verify the Product name "MacBook
        String actualmb =shoppingCartPage.getproduct();
        String expectedmb = "MacBook";
        Assert.assertEquals(actualmb,expectedmb);
        //2.11 Change Quantity "2
        shoppingCartPage.getnewmacbookqt();
        //2.12 Click on “Update” Tab
        shoppingCartPage.clickonupdate();
        //2.13 Verify the message “Success: You have modified your shopping cart!”
        String actualmodifiedcart = hplp3065page.getShoppingCartText();
        String expectedmodifiedcart = "Success: You have modified your shopping cart!\n" +
                "×";
        //2.14 Verify the Total £737.45
        String actualtotalmc = shoppingCartPage.gettotal();
        String expectedtotalmc ="$1,204.00";
        Assert.assertEquals(actualtotalmc,expectedtotalmc);
        //2.15 Click on “Checkout” button
        shoppingCartPage.clickoncheckout();
        //2.16 Verify the text “Checkout
        String actualcheckout = shoppingCartPage.verifycheckouttext();
       String expectedcheckout = "Checkout";
        Assert.assertEquals(actualcheckout,expectedcheckout);
        //2.17 Verify the Text “New Customer”
       String actualnewcustomer = checkOutPage.verifynewcustomer();
       String expectednewcustomer = "New Customer";
        Assert.assertEquals(actualnewcustomer,expectednewcustomer);
        //2.18 Click on “Guest Checkout” radio button
        //2.19 Click on “Continue” tab
        checkOutPage.clickonguestbutton();
        checkOutPage.fillinmandatoryfields();
        String actualwarning = checkOutPage.getwarning();
        String expectedwarning = "Warning: No Payment options are available. Please contact us for assistance!";
        Assert.assertEquals(actualwarning,expectedwarning);






    }

}
