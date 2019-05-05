package TestNGDemo;

import CofigReader.log4jConfigaration;
import TestBase.TestBase;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.*;

public class TestNGAnnotations extends TestBase {
    Logger logger = Logger.getLogger("Annotations");
 // This is main annotation
    @Test
    void Test123(){
        logger.info("TestAnnotations");
    }
@BeforeClass
    void Test() {

        logger.info("Beforeclass Test");
}
@AfterClass
     void Test1()
{
    logger.info("Afterclass Test");
}
@BeforeMethod
void Test2()
{
    logger.info("BeforeMethod Test");
    }
@AfterMethod
    void Test3()
{
    logger.info("afterMethod Test");
    }
    @BeforeSuite
    void Test4()
    {
        logger.info("BeforeSuit Test");

    }
    @AfterSuite
    void Test5()
    {
        logger.info("AfterSuit Test");

    }
@BeforeTest
    void Test6()
{
    logger.info("Beforetest Test");


}
@AfterTest
    void Test7()
{
    logger.info("AfterTest Test");

}

}
