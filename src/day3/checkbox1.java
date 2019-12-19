package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox1 {
    public static void main(String[] args) {
        // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // Check the Single Checkbox and check the message bellow it
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.findElement(By.id("isAgeSelected")).click();
       WebElement text = driver.findElement(By.id("txtAge"));
        String message = "Success - Check box is checked";
        if(text.getText().equals(message)){
            System.out.println("Success");

        }else{
            System.out.println("Failure");
        }



    }
}