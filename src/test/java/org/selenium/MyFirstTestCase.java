package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase {

    @Test
    public void dummyTest(){

        System.setProperty("webdriver.chrome.driver","/Users/alexisabner/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.close();
    }
}