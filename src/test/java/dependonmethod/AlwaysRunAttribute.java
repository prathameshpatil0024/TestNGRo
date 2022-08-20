package dependonmethod;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AlwaysRunAttribute {
       @Test
        public void bikeStart(){
            System.out.println("bike is start");
            Assert.assertFalse(true);
        }
        @Test(dependsOnMethods = "bikeStart",alwaysRun =true)
        void bikeDrive(){
            System.out.println("drive the bike");
        }
        @Test(dependsOnMethods ="bikeDrive")
        public void bikeStop(){
            System.out.println("Bike is stopped");
        }
        @Test(dependsOnMethods ="bikeDrive" )
        void bikePark(){
            System.out.println("bike is parke");
        }
    }



