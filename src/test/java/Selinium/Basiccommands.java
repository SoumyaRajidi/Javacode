package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basiccommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Nainakanti\\lib\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://games24x7.com");
        System.out.println("Title :"+driver.getTitle());// can get the title of the page
        System.out.println("url :"+driver.getCurrentUrl());
        driver.manage().window().maximize();
        driver.navigate().to("http://www.seleniumhq.org");
        System.out.println("Title :"+driver.getTitle());
        System.out.println("url :"+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("Title :"+driver.getTitle());
        System.out.println("url :"+driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println("Title :"+driver.getTitle());
        System.out.println("url :"+driver.getCurrentUrl());
        driver.quit(); //it quits all the windows which are opened in the main window


    }
}
