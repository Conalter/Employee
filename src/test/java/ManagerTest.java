import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Frank", "12CVEGIEZ", 5000.00, "HR");
    }

    @Test

    public void hasName(){
        assertEquals("Frank", manager.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("12CVEGIEZ", manager.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(5000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void raiseSalary(){
        manager.setSalary(10000.00);
        assertEquals(10000.00, manager.getSalary(), 0.1);
    }

    @Test
    public void getBonus(){
        assertEquals(50, manager.payBonus(), 0.1);
    }
    @Test
    public void getDeptName(){
       assertEquals("HR", manager.getDeptName());
    }

  
}
