package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.pluralsight.com");
    }
}