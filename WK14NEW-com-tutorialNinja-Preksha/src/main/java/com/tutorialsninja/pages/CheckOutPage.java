package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage extends Utility {
    By verifyshoppingcartcheckout =By.xpath("div[@id='content']/h1");
    By newcustomer = By.xpath("//div[@class='panel-body']/div/div/h2");
    By guestbutton =By.xpath("//div[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input");
    By continuebutton =By.id("button-account");
    By warning = By.xpath("//div[@id='collapse-payment-method']/div/div[1]");

    public String verifynewcustomer(){
        return getTextFromElement(newcustomer);
    }
    public void clickonguestbutton(){
        clickOnElement(guestbutton);
        clickOnElement(continuebutton);
    }
    public void fillinmandatoryfields() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Tom");
        driver.findElement(By.name("lastname")).sendKeys("Smith");
        driver.findElement(By.xpath("//div[@id='content']/div/div[2]/div[2]/div/div[1]/div[1]/fieldset/div[4]/input")).sendKeys("tomsmith@aol.com");
        driver.findElement(By.name("telephone")).sendKeys("123-555-9999");
        driver.findElement(By.name("address_1")).sendKeys("123 Main St");
        driver.findElement(By.name("city")).sendKeys("Dallas");
        driver.findElement(By.name("postcode")).sendKeys("12345");
        WebElement countrypick = driver.findElement(By.name("country_id"));
        Select select1 = new Select(countrypick);
        select1.selectByValue("223");
        WebElement statepick = driver.findElement(By.name("zone_id"));
        Select select2 = new Select(statepick);
        select2.selectByValue("3669");
        driver.findElement(By.xpath("//input[@id='button-guest']")).click();
        driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(" test test test");
        Thread.sleep(200);
        driver.findElement(By.xpath("//div[@id='accordion']/div[3]/div[2]/div/div[2]/div/input[1]")).click();
        driver.findElement(By.xpath("//div[@id='accordion']/div[3]/div[2]/div/div[2]/div/input[2]")).click();

    }
    public String getwarning(){
        return getTextFromElement(warning);
    }


}
