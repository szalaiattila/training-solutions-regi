package introinheritance.employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BossTest {

    @Test
    public void testCreateBoss() {
        Boss boss = new Boss("XY", "1117 Budapest, Budafoki út 56.", 500_000, 3);

        assertEquals("XY", boss.getName());
        assertEquals("1025 Budapest, Zöldlomb utca 24/B", boss.getAddress());
        assertEquals(650_000.0, boss.getSalary());
        assertEquals(3, boss.getNumberOfEmployees());
    }

    @Test
    public void testCreateBigBoss() {
        BigBoss boss = new BigBoss("XY", "1025 Budapest, Zöldlomb utca 24/B", 1_000_000, 6, 200_000);

        assertEquals("XY", boss.getName());
        assertEquals("1025 Budapest, Zöldlomb utca 24/B", boss.getAddress());
        assertEquals(1_800_000.0, boss.getSalary());
        assertEquals(6, boss.getNumberOfEmployees());
    }
}
