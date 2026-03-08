package com.tmb.driver.web.remote;

import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

public final class RemoteDriverFactory {

    // need to choose service and then browser

    private RemoteDriverFactory(){}

    private static final Map<BrowserRemoteModeType, Function<BrowserType,WebDriver>> BrowserRemoteModeTypeMap = new EnumMap<>(BrowserRemoteModeType.class);

    static {
        BrowserRemoteModeTypeMap.put(BrowserRemoteModeType.SELENIUM, SeleniumGridFactory::getDriver);
        BrowserRemoteModeTypeMap.put(BrowserRemoteModeType.SELENOID, SelenoidGridFactory::getDriver);
        BrowserRemoteModeTypeMap.put(BrowserRemoteModeType.BROWSER_STACK, BrowserStackFactory::getDriver);

    }

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
        return BrowserRemoteModeTypeMap.get(browserRemoteModeType).apply(browserType);
    }
//
//    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){
//
//        if( browserRemoteModeType == BrowserRemoteModeType.SELENIUM){
//            return SeleniumGridFactory.getDriver(browserType);
//        }else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID){
//            return SelenoidGridFactory.getDriver(browserType);
//        }else if(browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){
//            return BrowserStackFactory.getDriver(browserType);
//
//        }
//        return null;
//    }
}
