import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Lyle", "NINUMBER", 50000.00, "Development");
    }

    @Test

    public void hasName(){
        assertEquals("Lyle", developer.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("NINUMBER", developer.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void raiseSalary(){
        developer.setSalary(55000.00);
        assertEquals(55000.00, developer.getSalary(), 0.1);
    }

    @Test
    public void getBonus(){
        assertEquals(500, developer.payBonus(), 0.1);
    }
    @Test
    public void getDeptName(){
        assertEquals("Development", developer.getDeptName());
    }
}
