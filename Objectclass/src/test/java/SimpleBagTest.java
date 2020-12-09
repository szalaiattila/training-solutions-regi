import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleBagTest {


    @Test
    public void testConstructor() {
        //Given
        SimpleBag bag = new SimpleBag();
        //Then
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.size());
    }


    @Test
    public void testPut() {
        //Given
        SimpleBag bag = new SimpleBag();
        //When
        bag.putItem("xy");
        bag.putItem((new Book("Márai Sándor", "A gyertyák csonkig égnek")));
        bag.putItem(new Beer("Kézműves", 500));
        //Then
        assertFalse(bag.isEmpty());
        assertEquals(3, bag.size());
    }
}

