package com.tmb.config;

import com.tmb.config.coverters.StringToBrowserTypeConverter;
import com.tmb.config.coverters.StringToUrlConverter;
import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.BrowserType;
import com.tmb.enums.RunModeBrowserType;
import org.aeonbits.owner.Config;

import java.net.URL;

@Config.LoadPolicy(Config.LoadType.MERGE)

@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",
        //"file:${user.dir}/src/test/resources/dev-config.properties",
        //"file:${user.dir}/src/test/resources/staging-config.properties"
})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();

    @Key("runModeBroswer")
    RunModeBrowserType browserRunMode();

    @Key("browserRemoteMode")
    BrowserRemoteModeType browserRemoteMode();

    @ConverterClass(StringToUrlConverter.class)
    URL seleniumGridURL();

    @ConverterClass(StringToUrlConverter.class)
    URL selenoidURL();
}

