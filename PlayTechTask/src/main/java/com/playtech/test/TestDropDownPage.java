package com.playtech.test;

import Pages.DropDownPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestDropDownPage {
        WebDriver driver;
@Test
        public void setup(){
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(getChromeOptions());
            driver.get("https://www.rightmove.co.uk/property-for-sale/search.html?searchLocation=EN2&useLocationIdentifier=false&locationIdentifier=&buy=For+sale");
            driver.manage().window().maximize();
            driver.findElement(By.className("optanon-alert-box-button-middle accept-cookie-container")).click();
            //profile.default_content_setting_values.cookies";
            //optanon-alert-box-button-middle accept-cookie-container
            //optanon-allow-all accept-cookies-button
        }

        public static ChromeOptions getChromeOptions() {
            return new ChromeOptions().setHeadless(false);
        }



        @Test
        public void callMethods(){
            DropDownPage dropdown = new DropDownPage();
            dropdown.searchRadius();
            dropdown.priceRangeMin();
            dropdown.NumOfBedrooms();
            dropdown.PropertyType();
            dropdown.addedToSite();
            dropdown.findProperties();
           // dropdown.cleanUp();
        }
    }


