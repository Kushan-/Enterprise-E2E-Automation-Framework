package com.tmb.driver.web.local;

import com.tmb.config.Factory.ConfigFactory;
import com.tmb.driver.manager.web.local.ChromeManager;
import com.tmb.driver.manager.web.local.FireFoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDriver(){
        WebDriver driver = null;
        if(isBrowserChrome()) driver = ChromeManager.getDriver();
        else driver = FireFoxManager.getDriver();
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig()
                .browser() == BrowserType.CHROME;
    }

}
