package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class Base {

    protected static final String PATH = "src/test/resources/chromedriver";
    protected  WebDriver driver = new ChromeDriver();

    static {
        System.setProperty("webdriver.chrome.driver", PATH);
    }
}

