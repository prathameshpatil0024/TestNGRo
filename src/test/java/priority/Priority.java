package priority;

import org.testng.annotations.Test;

public class Priority {

    // If priority is not set by then Alphabetically set the priority.
    //TestNG runs the test case in alphabetical order.
    @Test
    public void methodC(){
        System.out.println("manager");
    }
    @Test
    public void methodD(){
        System.out.println("employee");
    }@Test
    public void methodA(){
        System.out.println("owner");
    }@Test
    public void methodB(){
        System.out.println("boss");
    }

}
