package com.tmb.driver.manager.web.remote.browserstack;

import com.tmb.driver.web.remote.BrowserStackConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public final class BrowserStackFirefoxManager {
    private BrowserStackFirefoxManager(){}

    public static WebDriver getDriver(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "firefox");
        capabilities.setCapability("browserVersion", "91.0");
        capabilities.setCapability("enableVNC", "true");
        capabilities.setCapability("enableVideo", "false");
        return new RemoteWebDriver(BrowserStackConfigFactory.getConfig().browserStackURL(), capabilities);

    }
}
