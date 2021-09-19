package com.gcbrowser;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class gcconfig {

    public static WebDriver driver;

    public static void main(String[] args){
        launch_chrome();
        window_size();
        //open_uri();
        //browser_size();
        cookies();

    }
    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void open_uri(){
        driver.get("https://www.google.com");
    }
    public static void window_size(){
        driver.manage().window().maximize();
    }
    public static void browser_size(){
        Dimension maxSize = driver.manage().window().getSize();
        System.out.println(maxSize);
    }
    public static void cookies(){
        Set allcookies = driver.manage().getCookies();
        System.out.println(allcookies.size());
    }
}
