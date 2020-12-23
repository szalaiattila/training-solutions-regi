package interfacemethods;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;


public class AccountTest {


    @Test
    public void testCreatedAfter() {
        Account account = new Account(LocalDateTime.of(2015, 1, ));
        boolean result = account.CreatedAfter(LocalDateTime.of(2020, 1, ));
        assertFalse(result);


    }

}