package listners;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerExample.class)
public class ListnerClass1 {
    @Test
    public void test1() {
        System.out.println("open the browser");
        Assert.assertTrue(true);
    }

    @Test
    public void test2() {
        System.out.println(" search the software testing course");
        Assert.assertTrue(false);
    }

    @Test
    public void test3() {
        System.out.println("go the website");
        Assert.assertFalse(true);
    }

    @Test(dependsOnMethods ="test3")
    public void test4() {
        System.out.println("read the page");
        Assert.assertFalse(false);
    }

    @AfterTest
    public void  reportClosed() {

    }


}
