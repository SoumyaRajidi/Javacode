package TestBase;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Domainobject {
    String browser;
    String url;
    String username;
    String password;
    String environment;
    String testurl;
    String stageurl;
    static WebDriver driver;
    static Logger logger = Logger.getLogger(Domainobject.class);
    String PropFileLoc="Config/configaration.properties";
    String PropFileLoc2="Config/configaration2.properties";

}
