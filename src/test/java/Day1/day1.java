package Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class day1 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"username\"]"))).sendKeys("Admin");
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\"password\"]"))).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }

}
