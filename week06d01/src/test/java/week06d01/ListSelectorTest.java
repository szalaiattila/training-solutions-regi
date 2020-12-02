package week06d01;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ListSelectorTest {

    ListSelector ls = new ListSelector();

    @Test
    public void getEvenIndexElementsTest(){
        assertEquals( "expected" "almabarack"),ls.getEvenIndexElements(Arrays.asList("alma","körte","barack")));
    }
    @Test
    public void getEvenIndexElementsWithEmptyList(){
        assertEquals( "expected",ls.getEvenIndexElements(new ArrayList<>()));
    }
}
