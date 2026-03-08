package com.tmb.driver.web.local;

import com.tmb.config.Factory.ConfigFactory;
import com.tmb.driver.manager.web.local.ChromeManager;
import com.tmb.driver.manager.web.local.FireFoxManager;
import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public final class LocalDriverFactory {

    private LocalDriverFactory(){}
//    private static final Map<BrowserType, Supplier<WebDriver>> MAP =
//            new EnumMap<>(BrowserType.class);

    private static final Map<BrowserType, Supplier<WebDriver>> BrowserTypeMap = new EnumMap<>(BrowserType.class);

    static {
        BrowserTypeMap.put(BrowserType.CHROME, ChromeManager::getDriver);
        BrowserTypeMap.put(BrowserType.FIREFOX, FireFoxManager::getDriver);
    }

    public static WebDriver getDriver(BrowserType browserType){
        return BrowserTypeMap.get(browserType).get();
    }


//    public static WebDriver getDriver(){
//        WebDriver driver = null;
//        if(isBrowserChrome()) driver = ChromeManager.getDriver();
//        else driver = FireFoxManager.getDriver();
//        return driver;
//    }

    private static boolean isBrowserChrome() {
        return ConfigFactory.getConfig()
                .browser() == BrowserType.CHROME;
    }

}
