package exam02.CV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CVTest {

    @Test
    public void testCreateWithName() {
        CV cv1 = new CV("John Doe");
        assertEquals("John Doe", cv1.getName());
    }

    @Test
    public void testAddSkills() {
        CV cv1 = new CV("John Doe");
        assertEquals(0, cv1.getSkills().size());
        cv1.addSkills("programming (5)", "oo design (2)");
        assertEquals(2, cv1.getSkills().size());
        assertEquals("programming", cv1.getSkills().get(0).getName());
        assertEquals(5, cv1.getSkills().get(0).getLevel());
    }

    @Test
    public void testFindSkill() {
        CV cv = new CV("John Doe");
        cv.addSkills("programming (5)", "oo design (2)", "english (4)");
        assertEquals(2, cv.findSkillLevelByName("oo design"));
    }


    @Test
    public void testNotFoundSkill() {
        CV cv1 = new CV("John Doe");
        assertThrows(IllegalArgumentException.class,
                () -> cv1.findSkillLevelByName("programming"));

    }

}