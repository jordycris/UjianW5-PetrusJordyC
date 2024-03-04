package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import io.cucumber.java.Before;
import io.cucumber.java.AfterAll;
import org.openqa.selenium.WebDriver;

public class Hooks {

    static WebDriver driver;

    @Before
    public static void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        // extend report
    }

    @AfterAll
    public static void finish() {
        DriverSingleton.delay(4);
        DriverSingleton.closeObjectInstance();
    }

}
