package tests.d14_properties_driver_class_test_class;

import org.testng.annotations.Test;

public class SingeltonTest {
    @Test
    public void test1(){
        //Singleton s=new Singleton();
        String s1=Singleton.getInstance();
        String s2=Singleton.getInstance();
        System.out.println("s1= "+s1);
        System.out.println("s2= "+s2);
    }
}
