package com.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class loginTest {

    public static WebDriver driver;

    public static void main(String[] args){

        launch_chrome();
        open_uri();
        window_size();
        T1();
        T2();
        T3();
        T4();
        quit_chrome();
    }
    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void open_uri(){
        driver.get("https://demo.opencart.com/index.php?route=account/login");
    }
    public static void window_size(){
        driver.manage().window().maximize();
    }
    public static void quit_chrome(){

        driver.quit();
    }
    public static void T1(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("kamrul.rezu@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345678");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="My Account";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

        WebElement logout=driver.findElement(By.linkText("Logout"));
        logout.click();

        WebElement login=driver.findElement(By.linkText("Login"));
        login.click();
    }
    public static void T2(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("test@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345678");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
    public static void T3(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("kamrul.rezu@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("12345629");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }
    public static void T4(){

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("test@gmail.com");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.clear();
        pass.sendKeys("1234123");

        WebElement loginBtn=driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input"));
        loginBtn.click();

        String expected="Account Login";
        String actual=driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }
    }

}
