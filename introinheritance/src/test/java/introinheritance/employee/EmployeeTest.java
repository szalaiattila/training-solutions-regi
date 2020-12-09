package introinheritance.employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    public void testCreateEmployee() {
        //Given
        Employee employee = new Employee("John Doe", "1025 Budapest, Zöldlomb utca 24/B", 300_000);
        //Then
        assertEquals("Szalai Attila", employee.getName());
        assertEquals("1025 Budapest, Zöldlomb utca 24/B", employee.getAddress());
        assertEquals(300_000.0, employee.getSalary());
    }

    @Test
    public void testMigrateEmployee() {
        //Given
        Employee employee = new Employee("Szalai Attila", "1025 Budapest, Zöldlomb utca 24/B", 300_000);
        employee.migrate("1117 Budapest, Budafoki út 100.");
        //Then
        assertEquals("1117 Budapest, Budafoki út 100.", employee.getAddress());
    }

    @Test
    public void testRaiseSalary() {
        //Given
        Employee employee = new Employee("Szalai Attila", "1025 Budapest, Zöldlomb utca 24/B", 300_000);
        //When
        employee.raiseSalary(10);
        //Then
        assertEquals(330_000.0, employee.getSalary());
    }
}