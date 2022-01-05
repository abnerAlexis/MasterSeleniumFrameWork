package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyFirstTestCase extends Base {

    @Test
    public void dummyTest() {

        driver.get("https://askomdch.com");
        //driver.close();
    }
}
