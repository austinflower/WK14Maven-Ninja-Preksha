package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyAccountsTest extends TestBase {
    MyAccountsPage myAccountsPage = new MyAccountsPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully (){

        myAccountsPage.clickonRegister();
        //1.3 Verify the text “Register Account”.
        String actualregacct = myAccountsPage.getregistertext();
        String expectedregacct = "Register Account";
        Assert.assertEquals(actualregacct,expectedregacct);
    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully (){
        myAccountsPage.clickonmyaccount();
        String actualreturncust = myAccountsPage.getreturncust();
        String expectedreturncust = "Returning Customer";
        Assert.assertEquals(actualreturncust,expectedreturncust);

    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        myAccountsPage.clickonRegister();
        myAccountsPage.fillinregisterinfo();
        String actualacctcreated = myAccountsPage.getregistertext();
        String expectedacctcreated ="Your Account Has Been Created!";
        Assert.assertEquals(actualacctcreated,expectedacctcreated);
        myAccountsPage.fillinRESTInfo();
        String actualacclogout = myAccountsPage.getregistertext();
        String expectedacclogout = "Account Logout";
        Assert.assertEquals(actualacclogout,expectedacclogout);
        myAccountsPage.logoutcontinue();

    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        myAccountsPage.clickonmyaccount();
        myAccountsPage.logininfo();
        String actualmyacct = myAccountsPage.getmyaccount();
        String expectedmyacct = "My Account";
        Assert.assertEquals(actualmyacct,expectedmyacct);
        myAccountsPage.accountlink();
        String actuallogout = myAccountsPage.getregistertext();
        String expectedlogout = "Account Logout";
        Assert.assertEquals(actuallogout,expectedlogout);
        myAccountsPage.logoutcontinue();





    }
}
