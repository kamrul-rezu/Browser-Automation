package com.registration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class regTest {

    public static WebDriver driver;

    public static void main(String[] args){

        launch_chrome();
        open_uri();
        window_size();
        Register();
        //quit_chrome();
    }
    public static void launch_chrome(){
        System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
    }
    public static void open_uri(){
        driver.get("https://demo.opencart.com/index.php?route=account/register");
    }
    public static void window_size(){
        driver.manage().window().maximize();
    }
    public static void quit_chrome(){

        driver.quit();
    }
    public static void Register(){

        WebElement fName=driver.findElement(By.id("input-firstname"));
        fName.clear();
        fName.sendKeys("kamrul");

        WebElement lName=driver.findElement(By.id("input-lastname"));
        lName.clear();
        lName.sendKeys("kamrul");

        WebElement email=driver.findElement(By.id("input-email"));
        email.clear();
        email.sendKeys("kamrul.rezu2@gmail.com");

        WebElement phone=driver.findElement(By.id("input-telephone"));
        phone.clear();
        phone.sendKeys("kamrul");

        WebElement pass=driver.findElement(By.id("input-password"));
        pass.sendKeys("12345678");

        WebElement Cpass=driver.findElement(By.id("input-confirm"));
        Cpass.sendKeys("12345678");

        WebElement check=driver.findElement(By.name("agree"));
        check.click();

        WebElement regBtn=driver.findElement(By.cssSelector("#content > form > div > div > input.btn.btn-primary"));
        regBtn.click();

        String expected="https://demo.opencart.com/index.php?route=account/success";
        String exact=driver.getCurrentUrl();

        if(expected.equals(exact)){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed");
        }

    }
}
