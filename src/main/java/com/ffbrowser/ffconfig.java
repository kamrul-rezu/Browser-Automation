package com.ffbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ffconfig {

    public static WebDriver driver;

    public static void main(String[] args){
        launch_firefox();

    }
    public static void launch_firefox(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
