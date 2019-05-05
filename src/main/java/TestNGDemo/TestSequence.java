package TestNGDemo;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSequence {
    @Test(priority=2, description="this is priority 2", dependsOnMethods = "Testc")
    void Testb() {
        System.out.println("Test B");
    }

    @Test(priority=3,description="this is priority 3")
    void Testa(){
        System.out.println("Test a");
    }

    @Test(priority=1,description="this is priority 1")
    void Testc(){
        System.out.println("Test c");
        ArrayList list=new ArrayList();
        list.get(2);
    }
}
