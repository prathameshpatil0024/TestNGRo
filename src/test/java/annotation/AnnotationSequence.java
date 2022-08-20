package annotation;

import org.testng.annotations.*;

public class AnnotationSequence extends AnnotationExample  {
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void BeforeTest(){
        System.out.println("Before TestEx");
    }@BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class");
    }@BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }@Test
    public void example1(){
        System.out.println("example1");
    }@Test
    public void example2() {
        System.out.println("example2");
    }
}

