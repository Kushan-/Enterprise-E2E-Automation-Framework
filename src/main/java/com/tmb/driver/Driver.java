package com.tmb.driver;

import org.openqa.selenium.WebDriver;

public final class Driver {
    private Driver(){}

    public static void initDriver(){ //LocalDriverFactory
        WebDriver driver = LocalDriverFactory.getDrive();
        driver.get("https://phidiaspropfirm.com/");

    }

    public static void quitDriver(){
        /*
        pass
         */
    }
}
