package priority;

import org.testng.annotations.Test;

public class SetPriority {
    //priority set as negative num also
    @Test(priority = -1)
    public void methodB() {
        System.out.println("Owner");
    } @Test(priority=-2)
        public void methodE(){
            System.out.println("company");
    }//priority set as positive number
    @Test(priority=1)
    public void methosA(){
        System.out.println("manager");
    }//priority set as default also like(0)
    @Test()
    public void methodC(){
        System.out.println("Boss");
    }@Test (priority=2)
    public void methodD() {
        System.out.println("employer");
    } // not defining TestNG priority as decimal type like 10.25
   /* @TestEx (priority=1.5)
    public void methodE(){
        System.out.println("staff"); */
    }


