import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

    @Before
    public void setUp() {
        manager = new Manager("Dave", "AB012345", 40000, "Sales");
    }

    @Test
    public void hasName() {
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AB012345", manager.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void hasDept() {
        assertEquals("Sales", manager.getDeptName());
    }

    @Test
    public void canGiveRaise() {
        manager.raiseSalary(2000.00);
        assertEquals(42000, manager.getSalary());
    }

    @Test
    public void cantGiveNegativeRaise() {
        manager.raiseSalary(-1000.00);
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(400, manager.payBonus(), 0.0);
    }
}
