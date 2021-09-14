package com.gcbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class gcconfig {

    public static WebDriver driver;

    public static void main(String[] args){
        launch_chrome();

    }
    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
