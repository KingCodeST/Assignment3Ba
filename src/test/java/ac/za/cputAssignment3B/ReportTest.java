package ac.za.cputAssignment3B;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ReportTest {
private Report report;
    ApplicationContext sfr=new AnnotationConfigApplicationContext();
    @Test
    public void getStudNu() {

        sfr.getBean("calc");
    }

    @Test
    public void setStudNu() {
        String name= (String) sfr.getBean("calc");

    }

    @Test
    public void getStudDetails() {
    }

    @Test
    public void setStudDetails() {
    }

    @Test
    public void getNumber() {
    }

    @Test
    public void setNumber() {
    }

    @Test
    public void getModuleFee() {
    }

    @Test
    public void setModuleFee() {
    }

    @Test
    public void getMarks() {
    }
}