package tests.d14_properties_driver_class_test_class;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilitis.ConfigurationReader;

public class PropertiesTest {

    @Test
    public void test1(){
        // we provide the key of the property to get method
        String browser= ConfigurationReader.get("browser");
        System.out.println(browser);
       // Assert.assertEquals(browser,"chrome");

        System.out.println(ConfigurationReader.get("url"));
        System.out.println(ConfigurationReader.get("mybrowser"));
    }

}
