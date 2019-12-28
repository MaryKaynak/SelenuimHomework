package day9;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork3XPath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/login");

        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("SuperSecretPassword!");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='login']/button")).click();
        Thread.sleep(2000);
        String logintext = "Welcome to the Secure Area. When you are done click logout below.";
        WebElement webElement = driver.findElement(By.xpath("//*[@id='content']/div/h4"));
        if (logintext.equals(webElement.getText().trim())) {
            System.out.println("Login success");
        } else {
            System.out.println("Login Failure");
        }
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
        Thread.sleep(2000);
        String logouttext = "You logged out of the secure area!";

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"flash\"]"));
        String logoutText1 = webElement1.getText().replace(webElement1.findElement(By.xpath("//*[@id=\"flash\"]/a")).getText(), "").trim();
        if (logouttext.equals(logoutText1)) {
            System.out.println("Logout success");
        }

       WebElement message = driver.findElement(By.xpath("//div[@id='flash-messages']"));
       WebElement buton = driver.findElement(By.xpath("//*[@id='flash']/a"));

        String text = message.getText().replace(buton.getText(), "").trim();
        System.out.println(text);


    }


}

