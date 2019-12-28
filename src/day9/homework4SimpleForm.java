package day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class homework4SimpleForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/filling-out-forms/");
        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("et_pb_contact_name_0")).sendKeys("Fool around in the Java Library");
            driver.findElement(By.name("et_pb_contact_message_0")).sendKeys("Form filled out successfully");
            driver.findElement(By.name("et_builder_submit_button")).click();
            Thread.sleep(2000);
        }
        WebElement element = driver.findElement(By.xpath("//*[@id=\"et_pb_contact_form_0\"]/div/p"));

        if (element.getText().equals("Form filled out successfully")) {
            System.out.println("Form filled out successfully");
        } else
            System.out.println("Form filled out not successfully");

    }
}
