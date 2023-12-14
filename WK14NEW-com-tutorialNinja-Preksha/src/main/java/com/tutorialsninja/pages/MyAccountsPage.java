package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class MyAccountsPage extends Utility {
By registertext = By.xpath("//div[@id='content']/h1");
By myaccount = By.xpath("//div[@id='content']/h2");
By returncust = By.xpath("//div[@id='content']/div/div[2]/div/h2");
    public void clickonRegister (){
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/ul/li[1]/a");

    }
    public String getregistertext(){
        return getTextFromElement(registertext);
    }
    public void clickonmyaccount (){
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/ul/li[2]/a");
    }
    public String getreturncust (){
        return getTextFromElement(returncust);
    }
    public void fillinregisterinfo (){
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.name("email")).sendKeys("tomsmith105@aol.com");
        driver.findElement(By.name("telephone")).sendKeys("555-555-5555");
        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.name("confirm")).sendKeys("123456789");
        //3.9 Select Subscribe Yes radio button
        selectMyAccountOptions("//div[@id='content']/form/fieldset[3]/div/div/label[1]/input");
        //3.10 Click on Privacy Policy check box
        selectMyAccountOptions("//div[@id='content']/form/div/div/input[1]");
        //3.11 Click on Continue button
        selectMyAccountOptions("//div[@id='content']/form/div/div/input[2]");
    }
    public void fillinRESTInfo (){
        driver.findElement(By.xpath("//div[@class='pull-right']/a")).click();
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/a");
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/ul/li[5]/a");

    }
    public void logoutcontinue(){
        selectMyAccountOptions("//div[@id='content']/div/div/a");
    }
    public void logininfo (){
        driver.findElement(By.id("input-email")).sendKeys("tomsmith105@aol.com");
        driver.findElement(By.id("input-password")).sendKeys("123456789");
        driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div/form/input")).click();

    }
    public String getmyaccount (){
        return getTextFromElement(myaccount);
    }
    public void accountlink (){
        driver.findElement(By.xpath("//div[@id='top-links']/ul/li[2]/a")).click();
        selectMyAccountOptions("//div[@id='top-links']/ul/li[2]/ul/li[5]/a");


    }
}
