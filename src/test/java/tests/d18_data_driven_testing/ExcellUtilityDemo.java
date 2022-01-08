package tests.d18_data_driven_testing;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import utilitis.ExcelUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public class ExcellUtilityDemo {// constructor

    @Test
    public void readExcelTest()  {
        //create an isnatnce of the excel utility
        //argument 1: location of file
        //argument 2: sheet we want to open
        //when we create object of this utility it means we opened the file and accessed certain sheet inside it
        ExcelUtil qa1Short=new ExcelUtil("src/test/resources/Vytrack testusers.xlsx","QA1-short");
        List<Map<String,String>> dataList=qa1Short.getDataList();











    }

}
