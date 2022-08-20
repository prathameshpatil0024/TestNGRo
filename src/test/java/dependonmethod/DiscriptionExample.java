package dependonmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DiscriptionExample {
    @Test(description = "this is the login page")
    public void test1(){
        System.out.println("test1");

    }@Test(description ="customer complaint" )
    public void test2(){
        System.out.println("test2");
    }@Test
    public void test3(){
        System.out.println("test3");
    }
}

