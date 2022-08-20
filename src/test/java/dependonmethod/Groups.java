package dependonmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Groups {
    @Test(groups = "smoke")
    public void test1(){
        System.out.println("test1");
        Assert.assertFalse(true);
    }
    @Test(dependsOnGroups = "smoke")
    public void test2(){
        System.out.println("test2");
    }@Test(dependsOnMethods = "test2")
    public void test3(){
        System.out.println("test3");
    }
}