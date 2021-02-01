import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    private DatabaseAdmin admin;

    @Before
    public void setUp() {
        admin = new DatabaseAdmin("Sarah", "BB11111", 30000);
    }

    @Test
    public void hasName() {
        assertEquals("Sarah", admin.getName());
    }

    @Test
    public void hasNINumber() {
        assertEquals("BB11111", admin.getNINumber());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000, admin.getSalary());
    }


    @Test
    public void canGiveRaise() {
        admin.raiseSalary(1000.00);
        assertEquals(31000, admin.getSalary());
    }

    @Test
    public void cantGiveNegativeRaise() {
        admin.raiseSalary(-1000.00);
        assertEquals(30000, admin.getSalary());
    }

    @Test
    public void canCalculatePayBonus() {
        assertEquals(300, admin.payBonus(), 0.0);
    }

}
