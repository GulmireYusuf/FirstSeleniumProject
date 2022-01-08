package tests.d18_data_driven_testing;

import org.testng.annotations.Test;
import utilitis.ExcelUtil;

public class ExcellUtilityDemo {

    @Test
    public void readExcelTest(){
        //create an isnatnce of the excel utility
        //argument 1: location of file
        //argument 2: sheet we want to open
        ExcelUtil qa1Short=new ExcelUtil("src/test/resources/Vytrack testusers.xlsx","QA1-short");




    }

}
