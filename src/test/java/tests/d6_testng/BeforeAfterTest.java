package tests.d6_testng;

import org.testng.annotations.*;

public class BeforeAfterTest {

    @Test
    public void test1(){
        System.out.println("this is test one");
    }

    @Test
    public void test2(){
        System.out.println("this is test two");
    }
    @BeforeMethod
    public void setupMethod(){
        System.out.println("Before method");
        System.out.println("opening chrome");
    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("After method");
        System.out.println("closing chrome");
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("Before class: running only one time");
    }
    @AfterClass
    public void teardownClass(){
        System.out.println("After class: running only one time");
    }
}
