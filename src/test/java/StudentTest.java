import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {

    Student joe;

    @Before
    public void setStudent(){
        joe = new Student(1, "joe");
        joe.addGrade(90);
        joe.addGrade(95);
        joe.addGrade(100);
    }

    @Test
    public void testName(){
        assertSame("joe", joe.getName());
    }

    @Test
    public void testGrades(){
        assertEquals(95, joe.getGradeAverage(), 1);
    }


}
