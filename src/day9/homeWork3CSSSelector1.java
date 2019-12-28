package day9;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class homeWork3CSSSelector1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hilal\\TechnoStudy\\Selenium\\chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/complicated-page/");

        driver.findElement(By.cssSelector("#Skills_Improved")).getText();
        Assert.assertTrue(driver.findElement(By.cssSelector("#Skills_Improved")).getText().contains("Skills Improved:"));
        System.out.println("First text is success");

        driver.findElement(By.cssSelector("div.et_pb_text_inner ul li")).getText();
        Assert.assertTrue(driver.findElement(By.cssSelector("div.et_pb_text_inner ul li")).getText().contains("How to deal with a large page that has many elements and divisions?"));

        System.out.println("Second text success");
        driver.findElement(By.cssSelector("//*[@id=\"et-boc\"]/div/div/div/div[1]/div/div/div/ul/li[2]")).getText();

        Assert.assertTrue(driver.findElement(By.cssSelector("//*[@id=\"et-boc\"]/div/div/div/div[1]/div/div/div/ul/li[2]")).getText().contains("Properly structuring your page objects"));
        System.out.println("Third text success");

    }

}
