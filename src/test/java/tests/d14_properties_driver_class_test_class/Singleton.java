package tests.d14_properties_driver_class_test_class;

public class Singleton {

    //singelton class will have private constructor
    //it means other classess cannot create object of this class
    private Singleton(){}

    static String str;

    public  static String getInstance(){
        if(str==null){
            System.out.println("str is null, assigning value to it");
            str="she was good";
        }else{
            System.out.println("it already has a value");
        }
        return str;
    }

    }

