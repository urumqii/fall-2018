package com.cybertek.tests;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitExample {

    @Test
    public void test() throws InterruptedException {
        Driver.getDriver().get("https://the-internet.herokuapp.com/dynamic_controls");

        // click on enable
        Driver.getDriver().findElement(By.xpath("//form[@id='input-example']//button")).click();
        // WebDriverWait  class used to explicit waits
        // just creating onject, waiting does not happen yet
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        // wait.until() : this is when wait happens
        // we are waiting for certain element this this xpath to be clickable
        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//input[@type='text']")));

        // enter text
        Driver.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys("hello world");



    }

}
