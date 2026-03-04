package com.tmb.driver;

import com.tmb.config.ConfigFactory;
import com.tmb.driver.manager.ChromeManager;
import com.tmb.driver.manager.FireFoxManager;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}

    public static WebDriver getDrive(){
        WebDriver driver =null;
        if (isBrowserChrome()) {

            driver = ChromeManager.getDriver();

        }else {
            driver = FireFoxManager.getDriver();
        }
        return driver;
    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig().browser() == BrowserType.CHROME;
    }


}
