package com.playtech.test;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomePage {
    @Test
    public void testForHomePage() {
        HomePage hm = new HomePage();
        hm.setUp();
        hm.searchBox();
        hm.forSale();

}
}
