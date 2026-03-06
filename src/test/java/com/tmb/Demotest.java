package com.tmb;

import com.tmb.config.FrameworkConfig;
import com.tmb.driver.web.remote.BrowserStackConfigFactory;
import org.aeonbits.owner.ConfigCache;
import org.testng.annotations.Test;

public class Demotest {
    // local , remote(selenium, selenoid) , broswestack // chrome, firefox
    @Test
    public void testLogin(){
        FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class); // only one instance of this class
        System.out.println(config.browser());

        System.out.println(BrowserStackConfigFactory.getConfig().browserStackURL());


    }

    public static class WebBase {
    }
}
