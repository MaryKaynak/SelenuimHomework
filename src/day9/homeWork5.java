package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork5 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.ultimateqa.com/users/sign_up");
        driver.findElement(By.id("user[first_name]")).sendKeys("Hilal");
        driver.findElement(By.id("user[last_name]")).sendKeys("Kaynak");
        driver.findElement(By.id("user[email]")).sendKeys("marykaynak@gmail.com");
        driver.findElement(By.id("user[password]")).sendKeys("edirne");
        driver.findElement(By.id("user[terms]")).click();
        driver.findElement(By.xpath("//*[@class='button button-primary g-recaptcha']")).click();


    }
}
