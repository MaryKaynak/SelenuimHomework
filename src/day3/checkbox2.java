package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class checkbox2 {
    // https://www.seleniumeasy.com/test/basic-checkbox-demo.html
    // Check the Multiple Checkbox and check the button message
    // When you check all the checkboxes, button message will change to 'Uncheck All'
    // When you uncheck at least one checkbox, button message will change to 'Check All'

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        List<WebElement> uncheckedBoxes = driver.findElements( By.cssSelector( ".cb1-element:not(:checked)" ) );
        int sizeBefore = uncheckedBoxes.size();

        driver.findElement( By.id( "check1" ) ).click();

        List<WebElement> checkedBoxes = driver.findElements( By.cssSelector( ".cb1-element:checked" ) );
        int sizeAfter = checkedBoxes.size();

        if(sizeBefore == sizeAfter) {
            System.out.println("Success!");
        } else {
            System.out.println("Failure!");
        }

    }
}
