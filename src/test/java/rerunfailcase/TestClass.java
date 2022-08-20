package rerunfailcase;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;
import org.testng.annotations.Listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestClass implements IAnnotationTransformer {
    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
//        annotation.setRetryAnalyzer(RerunFailTest)
    }
}
