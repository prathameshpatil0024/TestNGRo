package rerunfailcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExample {
    @Test(retryAnalyzer = Analyzer.class)
    public void  test1(){
        Assert.assertTrue(false);
    }
    @Test(retryAnalyzer = Analyzer.class)
    public void test2(){
        Assert.assertTrue(true) ;
    }
    @Test(retryAnalyzer = Analyzer.class)
    public void test3(){
        Assert.assertFalse(true) ;
    }
    @Test(retryAnalyzer = Analyzer.class)
    public void test4(){
        Assert.assertTrue(false) ;
    }
}


