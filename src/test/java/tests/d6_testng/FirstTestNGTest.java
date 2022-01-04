package tests.d6_testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class FirstTestNGTest {

    @Test
    public void test1(){
        System.out.println("this is my first test");
    }
    @Ignore
    @Test
    public void test2(){
        System.out.println("this is my second test");
    }
}
