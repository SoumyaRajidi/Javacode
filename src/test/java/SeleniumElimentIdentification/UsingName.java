package SeleniumElimentIdentification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingName {

    public static void main(String[] args) throws InterruptedException {
        String url="https://mail.rediff.com/cgi-bin/login.cgi";
        String driverpath="C:\\Users\\Nainakanti\\lib\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath);
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.name("login"));
        WebElement titletxt = driver.findElement(By.name("login"));
        titletxt.sendKeys("SoumyaRajidi");
        Thread.sleep(2000);
        titletxt.clear();
        Thread.sleep(2000);
        driver.findElement(By.name("login")).sendKeys("Nainakanti");

    }
}