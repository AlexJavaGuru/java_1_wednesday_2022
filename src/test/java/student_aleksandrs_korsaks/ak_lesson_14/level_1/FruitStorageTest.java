package student_aleksandrs_korsaks.ak_lesson_14.level_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {

    List<Apple> apples = new ArrayList<>();
    FruitStorage fruitStorage = new FruitStorage();

    Apple one = new Apple("red", 100);
    Apple two = new Apple("red", 160);
    Apple three = new Apple("red", 200);
    Apple four = new Apple("green", 200);
    Apple five = new Apple("green", 90);
    Apple six = new Apple("green", 50);
    Apple seven = new Apple("yellow", 50);
    Apple eight = new Apple("yellow", 170);

    @BeforeEach
    void setUp() {
        apples.add(one);
        apples.add(two);
        apples.add(three);
        apples.add(four);
        apples.add(five);
        apples.add(six);
        apples.add(seven);
        apples.add(eight);
    }

    @Test
    void getAllGreenApples() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(four);
        expectedResult.add(five);
        expectedResult.add(six);
        assertEquals(expectedResult, fruitStorage.getAllGreenApples());
    }
}