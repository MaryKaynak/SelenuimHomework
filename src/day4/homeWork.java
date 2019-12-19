package day4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork {
    // go to URL: https://www.seleniumeasy.com/test/
    // click on each link of class="board-inner"
    // and validate that class="tab-content" has
    // correct text for "h3" tag and adjacent "p" tag in active div
    // after you click associated link above

    // there should be at least 5 test of "h3" tag and adjacent "p" tag
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");

    }
}
