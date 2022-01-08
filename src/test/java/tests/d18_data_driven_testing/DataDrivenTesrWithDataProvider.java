package tests.d18_data_driven_testing;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesrWithDataProvider {
    // this method provide test data
   @DataProvider
    public Object[][]testData() {
       String[][] data = {
               {"Kung fury", "10"},
               {"Titanic", "1"},
               {"Spider Man", "2"},
               {"lala","9"}
       };
       return data;
   }
   @Test(dataProvider = "testData")
    public void test1(String name, String rating){
       System.out.println("Movie "+name +" has rating "+rating);

   }


}
