package com.tmb.driver.web.remote;

import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import org.openqa.selenium.WebDriver;

public final class RemoteDriverFactory {

    // need to choose service and then browser

    private RemoteDriverFactory(){}

    public static WebDriver getDriver(BrowserRemoteModeType browserRemoteModeType, BrowserType browserType){

        if( browserRemoteModeType == BrowserRemoteModeType.SELENIUM){
            return SeleniumGridFactory.getDriver(browserType);
        }else if (browserRemoteModeType == BrowserRemoteModeType.SELENOID){
            return SelenoidGridFactory.getDriver(browserType);
        }else if(browserRemoteModeType == BrowserRemoteModeType.BROWSER_STACK){
            return BrowserStackFactory.getDriver(browserType);

        }
        return null;
    }
}
