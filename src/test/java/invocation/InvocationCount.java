package invocation;

import org.testng.annotations.Test;

public class InvocationCount {
    /** invocation count is used When run multiple times test case With same method**/

    @Test(invocationCount =5 )
    public void methodB(){
        System.out.println("test case1");
    } @Test(priority=1,invocationCount = 50,invocationTimeOut =300)
    public void methodD(){
        System.out.println(" test case2");
    }@Test(priority=2)
    public void methodA(){
        System.out.println("test case3");
    }@Test(invocationCount = 3)
    public void methodC(){
        System.out.println("test case4");
    }
}

