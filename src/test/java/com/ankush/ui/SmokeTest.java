package com.ankush.ui;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmokeTest {

    @Test
    void openSauceDemo() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://www.saucedemo.com");
            System.out.println("Title: " + driver.getTitle());
            assertTrue(driver.getTitle().contains("Swag Labs"));
        } finally {
            driver.quit();
        }
    }
}