package dependonmethod;

import org.junit.Assert;
import org.testng.annotations.Test;

public class DependGroups {
    @Test(groups ="webpage" )
    public void application(){
        System.out.println("banking application");
        Assert.assertTrue(false);
    }@Test(dependsOnGroups ="webpage")
    public void loginePage() {
        System.out.println("check the logine  page time");
    }@Test(groups ="bank" )
    public void sbi(){
        System.out.println("gov bank");
    }@Test(dependsOnGroups ="bank")
    public void hdfc (){
        System.out.println("private bank");
    }
}

