package tests.d18_data_driven_testing;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.DashboardPage;
import pages.LoginPage;
import utilitis.ExcelUtil;
import utilitis.TestBase;

public class DDTTest extends TestBase {

    @DataProvider()
    public Object[][] userList(){
        //read from excel in 2d array
        ExcelUtil qa3Short=new ExcelUtil("src/test/resources/Vytrack testusers.xlsx","QA3-short");

        String[][] dataArray=qa3Short.getDataArray();
        return dataArray;
    }
    @Test(dataProvider = "userList")
    public void test1(String execute,String username,String password,String firstname,String lastname){
       extentLogger= reports.createTest("Testing "+firstname+" "+lastname);
        System.out.println(username);
        //login using excel data
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
        // get the actual
        String actualName=new DashboardPage().userName.getAccessibleName();
        String expected=firstname+" "+lastname;

        Assert.assertEquals(actualName,expected);

    }

}
