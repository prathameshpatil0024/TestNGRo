package rerunfailcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoClass {
    @Test
    public void  test1(){
        Assert.assertTrue(true);
    }
    @Test
    public void test2(){
        Assert.assertTrue(true) ;
    }
    @Test
    public void test3(){
        Assert.assertFalse(true) ;
    }
    @Test
    public void test4(){
        Assert.assertTrue(false) ;
    }
}
