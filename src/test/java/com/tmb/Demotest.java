package com.tmb;

import com.tmb.config.FrameworkConfig;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demotest {
    // local , remote(selenium, selenoid) , broswestack // chrome, firefox
    @Test
    public void testLogin(){
        System.out.println(ConfigFactory.getProperties().browser());
        FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class); // only one instance of this class
        System.out.println(config.browser());
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://phidiaspropfirm.com/");
//        driver.quit();
    }
}
