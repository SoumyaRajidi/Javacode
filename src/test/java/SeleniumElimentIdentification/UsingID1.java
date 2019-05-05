package SeleniumElimentIdentification;

import CofigReader.log4jConfigaration;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingID1 {

    public static void main(String[] args) throws InterruptedException {
        PropertyConfigurator.configure("Config/log4j.properties");
        Logger logger = Logger.getLogger(UsingID1.class);

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nainakanti\\lib\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.weddingshop.com/register");
        driver.manage().window().maximize();
        String title = "THE WEDDING SHOP";
        if (title.equals("THE WEDDING SHOP")) {
            logger.info("=========Title of the page loading successfully==========");
        } else {
            logger.error("there is some problem loading title of the page");
        }

        driver.findElement(By.id("title"));
        WebElement titletxt = driver.findElement(By.id("title"));
        titletxt.sendKeys("SoumyaRajidi");
        titletxt.clear();
        driver.findElement(By.id("title")).sendKeys("Nainakanti");

    }
}


