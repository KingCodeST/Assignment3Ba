package ac.za.cputAssignment3B;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClassTestTest {
   private ClassTest classTest;



    @Before
    public void setUp() throws Exception {
        ApplicationContext sr=new AnnotationConfigApplicationContext();
        classTest =(ClassTest)sr.getBean("calc");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getMarks() {
        int MarksPerTest= (int) classTest.getMarksPerTest(5,5);
        Assert.assertEquals(MarksPerTest,20,32);
    }

    @Test
    public void getMarksPerTest() {
        int MarksPerTest= (int) classTest.getMarksPerTest(5,5);
        Assert.assertEquals(MarksPerTest,20,32);
    }

    @Test
    public void setMarksPerTest() {
    }

    @Test
    public String toString() {
        return null;
    }
}