package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.ultimateqa.com/users/sign_up");

        WebElement name = driver.findElement(By.id("user[first_name]"));
        name.sendKeys("Hilal");

        WebElement lastname = driver.findElement(By.id("user[last_name]"));
        lastname.sendKeys("Kaynak");

        WebElement email = driver.findElement(By.id("user[email]"));
        email.sendKeys("marykaynak@gmail.com");

        WebElement password = driver.findElement(By.id("user[password]"));
        password.sendKeys("edirne");

        driver.findElement(By.id("user[terms]")).click();
        driver.findElement(By.xpath("//*[@class='button button-primary g-recaptcha']")).click();

        driver.get("https://courses.ultimateqa.com/users/sign_in");
        driver.findElement(By.xpath("//*[@class='button button-primary g-recaptcha']")).click();
        Thread.sleep(4000);

        WebElement emailvalidate = driver.findElement(By.id("user[email]"));
        email.sendKeys("marykaynak@gmail.com");
        System.out.println( email.equals( emailvalidate ) ? "Success!" : "Failure!" );

        WebElement passwordvalidate = driver.findElement(By.id("user[password]"));
        passwordvalidate.sendKeys("edirne");
        System.out.println( password.equals( passwordvalidate ) ? "Success!" : "Failure!" );



    }


}

