package TestBase;

import CofigReader.ConfigarationReader1;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

//import static CofigReader.log4jConfigaration.logger;

public class TestBase extends Domainobject {
    @BeforeSuite
    public void Initialize() throws IOException {
        Initializelog4j();
        configReader();
        launchBrowser();
    }

    public void enterurl() {
        logger.info("environment selected" + environment);
        if (environment.equalsIgnoreCase("test")) {
            url = testurl;
        } else if (environment.equalsIgnoreCase("stage")) {
            url = stageurl;
        }
        logger.info("url selected  :" + url);
        driver.get(url);
    }

    public void enterUrl(String url) {
        logger.info("URL selected : " + url);
        driver.get(url);
    }
    // to launch browsers based on the option provided in properties file

    private void launchBrowser() {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.ie.driver", ".\\Drivers\\ChromeDriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            logger.info("chrome driver is launched");
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
            WebDriver driver = new InternetExplorerDriver();
            driver.manage().window().maximize();
            logger.info("ie driver is launched");
        }
    }

    public void configReader() throws IOException {
        File file = new File(PropFileLoc);
        FileInputStream fls = new FileInputStream(file);
        File file1 = new File(PropFileLoc);
        FileInputStream fls1 = new FileInputStream(file1);
        Properties prop = new Properties();
        prop.load(fls);
        prop.load(fls1);
        browser = prop.getProperty("browser");
        System.out.print("browser selected from properties :" + browser);
        url = prop.getProperty("Testurl");
        System.out.print("testurl selected from properties :" + url);
    }
    //Initializing logs
    protected void Initializelog4j() {
        PropertyConfigurator.configure("Config/log4j.properties");
        logger.info("Log4j appender configuration is successful !!");
    }
}