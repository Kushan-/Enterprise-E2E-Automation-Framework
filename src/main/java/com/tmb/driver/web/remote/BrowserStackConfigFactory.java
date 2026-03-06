package com.tmb.driver.web.remote;

import com.tmb.config.BrowserStackConfig;
import com.tmb.config.FrameworkConfig;
import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigCache;

public final class BrowserStackConfigFactory {

    private BrowserStackConfigFactory(){}

    public static BrowserStackConfig getConfig(){
        return ConfigCache.getOrCreate(BrowserStackConfig.class);
    }
}
