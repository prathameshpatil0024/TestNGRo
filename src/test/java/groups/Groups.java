package groups;

import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "smoke")
    public void test1(){
        System.out.println("open amazon home page");
    }
    @Test(groups = {"smoke","regression"})
    public void test2(){
        System.out.println("login page");
    }
    @Test(groups ="sanity" )
    public void test3(){
        System.out.println("mobile");
    }
    @Test(groups="regression")
    public void test4(){
        System.out.println("buy cart");
    }
}


