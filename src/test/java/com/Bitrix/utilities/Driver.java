package com.Bitrix.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Driver {

    //1- Make constructor private. this class close to outside now with private
    private Driver(){ // class is private we can create instance from that classs
    }

    public static WebDriver driver; // Driver driver diyerek bu classi cagiracagiz.

    public static WebDriver getDriver() {
        if(driver == null){ // if it is create driver first time
            String browser = ConfigurationReader.getProperty("browser");

            switch(browser){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case"chrome-headless": // headless sitenin guclu olmadigi zaman siteyi hizlandirarak aciyor.
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case"firefox-headless": // headless just doesn’t show UI of the browser. No difference in terms of functionality, you just won’t be able to upload files
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
            }
        }
        return driver;
    }
    public static void closeDriver(){
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
