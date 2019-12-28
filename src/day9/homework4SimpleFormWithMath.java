package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework4SimpleFormWithMath {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/filling-out-forms/");
        driver.manage().window().maximize();

        driver.findElement(By.id("et_pb_contact_name_1")).sendKeys("jonah ");
        driver.findElement(By.name("et_pb_contact_message_1")).sendKeys("Form filled out successfully");

        String inputPath = "//*[@id=\"et_pb_contact_form_1\"]/div[2]/form/div/div/p/input";

        int first = Integer.parseInt(driver.findElement(By.xpath(inputPath)).getAttribute("data-first_digit"));
        int second = Integer.parseInt(driver.findElement(By.xpath(inputPath)).getAttribute("data-second_digit"));

        driver.findElement(By.xpath(inputPath)).sendKeys(Integer.toString(first + second));
        driver.findElement(By.name("et_builder_submit_button")).click();

    }
}
