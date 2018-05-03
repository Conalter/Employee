import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Frank", "12CVEGIEZ", 5000);
    }

    @Test
    public void hasName(){
        assertEquals("Frank", employee.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("12CVEGIEZ", employee.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(5000, employee.getSalary());
    }

}
