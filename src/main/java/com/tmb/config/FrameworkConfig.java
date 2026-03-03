package com.tmb.config;

import com.tmb.config.coverters.StringToBrowserTypeConverter;
import com.tmb.enums.BrowserType;
import org.aeonbits.owner.Config;

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

    @DefaultValue("staging")
    String environment();

    @Key("${environment}.username")
    String username();

    @Key("${environment}.url")
    String url();
}

