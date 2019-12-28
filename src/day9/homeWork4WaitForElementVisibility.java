package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homeWork4WaitForElementVisibility {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

        WebElement remove = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
        remove.click();

        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkbox-example']/p")));
        if (driver.findElement(By.xpath("//form[@id='checkbox-example']/p")).getText().equalsIgnoreCase("it's gone!")) {
            System.out.println("Remove button: Success");
        }
        else {
            System.out.println("Remove button: Failure");
        }

        Thread.sleep(1000);

        WebElement add = driver.findElement(By.xpath("//form[@id='checkbox-example']/button"));
        add.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id='checkbox-example']/p")));
        if (driver.findElement(By.xpath("//form[@id='checkbox-example']/p")).getText().equalsIgnoreCase("it's back!")) {
            System.out.println("Add button: Success");
        }
        else {
            System.out.println("Add button: Failure");
        }

        Thread.sleep(1000);

        driver.quit();


    }
}

