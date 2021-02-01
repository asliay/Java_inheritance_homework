import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    private Developer developer;

    @Before
    public void setUp() {
        developer = new Developer("Ailsa", "AA00000", 25000);
    }

    @Test
    public void hasName() {
        assertEquals("Ailsa", developer.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("AA00000", developer.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void canGiveRaise() {
        developer.raiseSalary(2000.00);
        assertEquals(27000, developer.getSalary());
    }

    @Test
    public void cantGiveNegativeRaise() {
        developer.raiseSalary(-1000.00);
        assertEquals(25000, developer.getSalary());
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(250, developer.payBonus(), 0.0);
    }
}
