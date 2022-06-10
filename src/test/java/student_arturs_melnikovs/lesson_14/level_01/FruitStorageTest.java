package student_arturs_melnikovs.lesson_14.level_01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    private FruitStorage storage;

    @BeforeEach
    void setUp() {
        storage = new FruitStorage();
    }

    @Test
    void testGetGreenApples() {
        List<Apple> expected = Arrays.asList(
                new Apple("green", 200),
                new Apple("green", 90),
                new Apple("green", 50)
        );
        List<Apple> actual = storage.getGreenApples();
        assertEquals(expected, actual);
    }
}