package com.kodilla.testing2.crudapp;

import com.kodilla.testing2.google.config.WebDriverConfig;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CrudAppTestSuite {

    public static final String BASE_URL = "https://x-raf.github.io/";
    private WebDriver driver;

    @Before
    public void initTests() {
        driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(BASE_URL);
    }

    @After
    public void cleanUpAfterTest() {
        driver.close();
    }
}
