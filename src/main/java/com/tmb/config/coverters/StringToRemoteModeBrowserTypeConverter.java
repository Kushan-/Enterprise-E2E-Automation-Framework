package com.tmb.config.coverters;

import com.tmb.enums.BrowserRemoteModeType;
import com.tmb.enums.RunModeBrowserType;
import org.aeonbits.owner.Converter;

import java.lang.reflect.Method;

public class StringToRemoteModeBrowserTypeConverter implements Converter <BrowserRemoteModeType> {
    @Override
    public BrowserRemoteModeType convert(Method method, String runMode) {
        return BrowserRemoteModeType.valueOf(runMode.toUpperCase());
    }
}
