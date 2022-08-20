package dependonmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DisableTest {
    @Test(enabled = false)
    public void test1(){
        System.out.println("test1");
        Assert.assertFalse(true);
    }@Test
    public void test2(){
        System.out.println("test2");
    }@Test
    public void test3(){
        System.out.println("test3");
    }
}
