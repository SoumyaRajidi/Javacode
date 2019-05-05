package SeleniumElimentIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTextProperty {
    public static void main(String[] args) throws InterruptedException {
        String url = "https://shop.auspost.com.au/register";
        String driverpath = "C:\\Users\\Nainakanti\\lib\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[contains(.,'Create an account')]"));
        WebElement btncreatacc = driver.findElement(By.xpath("//button[contains(.,'Create an account')]"));
        btncreatacc.click();
    }
}
