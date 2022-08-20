package expectedexception;


import org.testng.annotations.Test;

public class ExceptionExample {
    @Test (expectedExceptions =ArithmeticException.class )
    public void test1(){
        System.out.println("TestNG");
        try {
            System.out.println(6/0);
        }catch(Exception c ){
            c.printStackTrace();
        }
        System.out.println("test1");
    }@Test
    public void test2(){
        System.out.println("test2");
    }@Test
    public void test3(){
        System.out.println("test3");
    }
}


