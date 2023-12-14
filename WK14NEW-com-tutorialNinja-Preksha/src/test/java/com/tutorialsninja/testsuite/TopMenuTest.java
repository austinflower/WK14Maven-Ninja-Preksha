package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopNotebookPage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    LaptopNotebookPage laptopNotebookPage = new LaptopNotebookPage();
    ComponentPage componentPage =new ComponentPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){

        homePage.clickonDesktoplink();
        String actualText = homePage.getDesktopText();
        String expecteddesktoptest = "Desktops";
        Assert.assertEquals(actualText,expecteddesktoptest);

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){

        homePage.clickonlapnotelink();
        String actuallapnoteTEXT = laptopNotebookPage.getshowalllapnoteTEXT();
        String expectedlaptop = "Laptops & Notebooks";
        Assert.assertEquals(actuallapnoteTEXT,expectedlaptop);


    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.clickOnComponentLink();
        String actualCompText = componentPage.getComponentText();
        String expectedCompText = "Components";
        Assert.assertEquals(actualCompText,expectedCompText);
    }

}
