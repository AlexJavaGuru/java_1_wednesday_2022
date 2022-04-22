package teacher.lesson_12_exceptions.lessoncode.v2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class BankSystemTest {

    private BankSystem bankSystem;

    @Before
    public void setUp() throws Exception {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "Alex"));
        users.add(new User(2L, "Oleg"));
        users.add(new User(3L, "Artur"));
        users.add(new User(4L, "Kate"));
        users.add(new User(5L, "Who?"));
        bankSystem = new BankSystem(users);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMustFailWithIllegalArgumentException() throws IllegalAccessException {
        bankSystem.getUserById(null, "1234");
    }

    @Test(expected = IllegalAccessException.class)
    public void testMustFailWithIlligalAccessException() throws IllegalAccessException {
        bankSystem.getUserById(123L, "7777");
    }

    @Test
    public void testUserWasFound() throws IllegalAccessException {
        Optional<User> actualResult = bankSystem.getUserById(5L, "1234");
        assertEquals(Optional.of(new User(5L, "Who?")), actualResult);
    }

    @Test
    public void testUserNotFound() throws IllegalAccessException {
        Optional<User> actualResult = bankSystem.getUserById(6L, "1234");
        assertEquals(Optional.empty(), actualResult);
    }
}