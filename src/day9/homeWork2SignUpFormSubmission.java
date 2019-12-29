package day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.net.MalformedURLException;
import java.net.URL;

public class homeWork2SignUpFormSubmission {
    public static void main(String[] args) throws InterruptedException, MalformedURLException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/hilal/SeleniumHomeWork/src/day9/homeWork1.html");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("Hilalkaynak");

        driver.findElement(By.id("password")).sendKeys("aydinlikgelecek");

        driver.findElement(By.id("passwordrepeat")).sendKeys("aydinlikgelecek");

        driver.findElement(By.id("address")).sendKeys("148 Merselis Ave Clifton NJ");

        WebElement checkbox = driver.findElement(By.id("female"));
        checkbox.click();

        WebElement select = driver.findElement(By.name("select"));
        Select plan = new Select(select);
        plan.selectByIndex(2);

        WebElement agreement = driver.findElement(By.name("type"));
        agreement.click();

        driver.findElement(By.name("picture")).click();

        String url = driver.getCurrentUrl();
        parseUrl(driver, url);
        System.out.println(url);

    }

    private static void parseUrl(WebDriver driver, String url) throws MalformedURLException {
        URL myurl = new URL(url);
        String sentkeys = myurl.getQuery();
        for (String str : sentkeys.split("&")) {
            System.out.println(str);
        }
    }


}



