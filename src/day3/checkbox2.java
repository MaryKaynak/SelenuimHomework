package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {
    // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    // Check the Multiple Checkbox and check the button message
    // When you check all the checkboxes, button message will change to 'Uncheck All'
    // When you uncheck at least one checkbox, button message will change to 'Check All'

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        driver.findElement(By.id("check1")).click();
    }
}
