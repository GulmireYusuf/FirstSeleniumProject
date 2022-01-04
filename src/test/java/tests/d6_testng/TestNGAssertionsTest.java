package tests.d6_testng;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one","one" );

        System.out.println("second assertion");
        Assert.assertEquals(1,1);
    }
    @Test
    public void test2(){
        Assert.assertNotEquals("one","two");
    }

    @Test
    public void test3(){
        String expectedTitle="Cbt";
        String actualTitle="C";

        Assert.assertTrue(expectedTitle.startsWith(actualTitle));

    }
    @Test
    public void test4(){
        Assert.assertFalse(1<0);
    }

    @Test
    public void test5(){
        Assert.assertEquals("Cbt","Cbt","Title did not match");
        //Assert.assertTrue("ma$cbt.com".contains("@"),"All emails ");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("close chrome");
    }
}
