package com.ffbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ffconfig {

    public static WebDriver driver;

    public static void main(String[] args){
        launch_firefox();
        //open_uri();
        window_size();
        quit_firefox();

    }
    public static void launch_firefox(){
        System.setProperty("webdriver.gecko.driver","./src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }
    public static void open_uri(){
        driver.get("https://www.google.com");
    }
    public static void quit_firefox(){

        driver.quit();
    }
    public static void window_size(){
        driver.manage().window().maximize();
    }
}
