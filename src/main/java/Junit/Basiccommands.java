package Junit;

import CofigReader.log4jConfigaration;
//import com.sun.tools.javac.util.Assert;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Basiccommands{
    //public static void main(String[] args) throws InterruptedException {
    @Test
    public void opennaukri(){
        PropertyConfigurator.configure("Config/log4j.properties");
        Logger logger = Logger.getLogger("(naukri)");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nainakanti\\lib\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://naukri.com");
        System.out.println("Title :"+driver.getTitle());// can get the title of the page
        System.out.println("url :"+driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        String Title= driver.getTitle();
        Assert.assertEquals("Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com", Title);
        logger.info("naukri is launched");
        driver.quit(); //it quits all the windows which are opened in the main window


    }
    @Test
    public void openseleniumhq(){
        PropertyConfigurator.configure("Config/log4j.properties");
        Logger logger = Logger.getLogger("Seleniumhq");

        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nainakanti\\lib\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://seleniumhq.org");
        System.out.println("Title :"+driver.getTitle());// can get the title of the page
        System.out.println("url :"+driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        logger.info("seleniumhq is launched");
        driver.quit(); //it quits all the windows which are opened in the main window

    }
    @Test
    public void openexception(){
        PropertyConfigurator.configure("Config/log4j.properties");
        Logger logger = Logger.getLogger("openexception");
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nainakanti\\lib\\chromedriver.exe");
        logger.error("Exception out of bound");
        ArrayList list=new ArrayList();
        logger.info(list.get(2));





    }

}
