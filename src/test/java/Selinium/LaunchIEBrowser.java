package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIEBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.ie.driver","C:\\Users\\Nainakanti\\lib\\IEdriverServer.exe");
        WebDriver driver=new InternetExplorerDriver();
        driver.get("http://www.Selenium.org.com");

    }
}
