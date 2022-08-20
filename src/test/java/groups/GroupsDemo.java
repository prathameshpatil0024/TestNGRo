package groups;

import org.testng.annotations.Test;

public class GroupsDemo  {
    @Test(groups = "smoke")
    public void test1(){
        System.out.println("test case case1");
    }  @Test(groups = "regressiuon")
    public void test2(){
        System.out.println("test case 2");
    }
    @Test(groups = {"smoke","sanity"})
    public void  test3(){
        System.out.println("test case 3");
    }
}






