package annotation;

        import org.testng.annotations.*;


public class AnnotationExample {
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("Before Suite");
    }@BeforeTest
    public void BeforeTest() {
        System.out.println("Before TestEx");
    }@BeforeClass
    public void BeforeClass() {
        System.out.println("Before Class");
    }@BeforeMethod
    public void BeforeMethod() {
        System.out.println("Before Method");
    }@Test
    public void example1() {
        System.out.println("example1");
    }@Test
    public void example2() {
        System.out.println("example2");
    }@AfterMethod
    public void AfterMethod() {
        System.out.println("After Method");
    }@AfterClass
    public void AfterClass() {
        System.out.println("After Class");
    }@AfterTest
    public void AfterTest() {
        System.out.println("After TestEx");
    }@AfterSuite
    public void AfterSuite() {
        System.out.println("After Suite");
    }

}


