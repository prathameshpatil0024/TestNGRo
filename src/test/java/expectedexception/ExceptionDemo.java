package expectedexception;

import org.testng.annotations.Test;

public class ExceptionDemo {
    @Test(expectedExceptions ={NullPointerException.class,ArithmeticException.class})
            public void test1(){
        System.out.println("TestNG");
          System.out.println(6/0);
          System.out.println("test1");
    }@Test
    public void test2(){
        System.out.println("test2");
    }@Test
    public void test3(){
        System.out.println("test3");
    }
}



