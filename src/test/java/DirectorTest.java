import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    private Director director;

    @Before
    public void setUp() {
        director = new Director("Stewart", "SW012345", 100000, "Sales", 45000.00);
    }

    @Test
    public void hasBudget() {
        assertEquals(45000.00, director.getBudget(), 0.0);
    }


    @Test
    public void hasName() {
        assertEquals("Stewart", director.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("SW012345", director.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void hasDept() {
        assertEquals("Sales", director.getDeptName());
    }

    @Test
    public void canGiveRaise() {
        director.raiseSalary(10000.00);
        assertEquals(110000, director.getSalary());
    }

    @Test
    public void cantGiveNegativeRaise() {
        director.raiseSalary(-1000.00);
        assertEquals(100000, director.getSalary());
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(2000, director.payBonus(), 0.0);
    }
}
