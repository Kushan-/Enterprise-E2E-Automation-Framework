package com.tmb.config;

import com.tmb.config.coverters.StringToUrlConverter;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "file:${user.dir}/src/test/resources/BrowserStack.properties",

})
public interface BrowserStackConfig extends Config {

    String userName();

    String key();

    @DefaultValue( "https://${userName}:${key}@hub-cloud.browserstack.com/wd/hub")
    @ConverterClass(StringToUrlConverter.class)
    URL browserStackURL();
}
