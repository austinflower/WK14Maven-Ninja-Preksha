package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {
    HomePage homePage = new HomePage();
    DeskTopPage desktoppage = new DeskTopPage();
    LaptopNotebookPage laptopNotebookPage = new LaptopNotebookPage();
    HPLP3065page hplp3065page = new HPLP3065page();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    @Test
    public void verifyProductArrangeInAlphabaticalOrder(){
        homePage.clickonDesktoplink();
        homePage.clickOnSortByDeskTop();
        homePage.alpaOrder();
        String actualText = homePage.getSortZA();
        String expectedText = "Name (Z - A)";
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickonDesktoplink();
        homePage.clickOnSortByDeskTop();
        homePage.alpaOrder();

        String actualAZ = homePage.getSortAZ();
        String expectedAZ = "Name (A - Z)";
        Assert.assertEquals(actualAZ,expectedAZ);
        homePage.clickOnSelectHP();
        String actualHP = hplp3065page.verifyHPLP3065();
        String expectedHP = "HP LP3065";
        Assert.assertEquals(actualHP,expectedHP);
        hplp3065page.selectDeliveryDate();
        hplp3065page.enterQTy();
        hplp3065page.clickoncart();

        String actualcartmessage = hplp3065page.getShoppingCartText();
        String expectedcartmsg = "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×";
        Assert.assertEquals(actualcartmessage,expectedcartmsg);
        hplp3065page.clickonshoppingcartmsg();

        String actualshoppingcarttext = shoppingCartPage.getverifyshoppingcart();
        String expectedshoppingcrttext = "Shopping Cart  (1.00kg)";
        Assert.assertEquals(actualshoppingcarttext,expectedshoppingcrttext);

        String actualprodname = shoppingCartPage.getproduct();
        String expectedprodname = "HP LP3065";
        Assert.assertEquals(actualprodname,expectedprodname);

        String actualdeliverydate = shoppingCartPage.getdeliverydate();
        String expecteddeliverydate = "Delivery Date:2022-11-30";
        Assert.assertEquals(actualdeliverydate,expecteddeliverydate);

        String actualmodel = shoppingCartPage.getmodel();
        String expectedmodel = "Product 21";
        Assert.assertEquals(actualmodel,expectedmodel);

        String actualtotal = shoppingCartPage.gettotal();
        String expectedtotal = "$122.00";
        Assert.assertEquals(actualtotal,expectedtotal);



    }
}
