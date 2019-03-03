package ac.za.config;

import ac.za.cputAssignment3B.AccademicReport;
import ac.za.cputAssignment3B.Report;
import ac.za.cputAssignment3B.Student;
import org.springframework.context.annotation.Bean;

public class AssignmentKingCodeConfig {

    @Bean(name="retiredcalc")
    public AccademicReport getStudent()
    {
        return new Student() {
            @Override
            public double getMarks() {
                return 0;
            }
        };

    }
    @Bean(name="calc")
    public AccademicReport getReport()
    {
        return new Report();
    }


}
