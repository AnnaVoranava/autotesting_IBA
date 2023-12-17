package com.stv.framework.core.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Driver {
    public static WebDriver driver;

    public static WebDriver getDriver() {

        if (driver == null) {
            setChromeDriver();
        }
        return driver;
    }

    private static void setChromeDriver() {
        String exePath = "D:\\programming\\Testing\\labs\\wiggle\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setJavascriptEnabled(true);
        driver = new ChromeDriver(capabilities);
    }


}