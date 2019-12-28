package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork5Optional {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        driver.findElement(By.id("user[email]")).sendKeys("marykaynak@gmail.com");
        driver.findElement(By.id("user[password]")).sendKeys("edirne");
        driver.findElement(By.xpath("//*[@class='button button-primary g-recaptcha']")).click();
    }
}
