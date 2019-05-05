package CofigReader;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static CofigReader.log4jConfigaration.logger;


public class ConfigarationReader1 {
    String PropFileLoc = "Config/configaration.properties";
    String browser;
    public String url;
    static WebDriver driver;

    public void configReader() throws IOException {
        File file = new File(PropFileLoc);
        FileInputStream fls = new FileInputStream(file);
        Properties prop = new Properties();
        prop.load(fls);
        String browser = prop.getProperty("browser");
        String Testurl = prop.getProperty("Testurl");

    }

    public void Initializelog4j(){
        PropertyConfigurator.configure("Config/log4j.properties");
        logger.info("Log4j appender configuration is successful !!");
    }
}
