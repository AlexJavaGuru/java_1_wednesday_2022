package student_aleksandrs_korsaks.ak_lesson_14.level_1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import student_aleksandrs_korsaks.ak_lesson_14.level_1_2.searc_criterias.AppleGreenColorPredicate;
import student_aleksandrs_korsaks.ak_lesson_14.level_1_2.searc_criterias.AppleHeavyWeightPredicate;
import student_aleksandrs_korsaks.ak_lesson_14.level_1_2.searc_criterias.AppleLightWeightPredicate;
import student_aleksandrs_korsaks.ak_lesson_14.level_1_2.searc_criterias.AppleRedColorPredicate;

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
        assertEquals(expectedResult, fruitStorage.findApples(new AppleGreenColorPredicate()));
    }

    @Test
    void getAllRedApples() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(one);
        expectedResult.add(two);
        expectedResult.add(three);
        assertEquals(expectedResult, fruitStorage.findApples(new AppleRedColorPredicate()));
    }

    @Test
    void getAllApplesOverWeight() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(two);
        expectedResult.add(three);
        expectedResult.add(four);
        expectedResult.add(eight);
        assertEquals(expectedResult, fruitStorage.findApples(new AppleHeavyWeightPredicate()));
    }

    @Test
    void getAllApplesUnderWeight() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(one);
        expectedResult.add(five);
        expectedResult.add(six);
        expectedResult.add(seven);
        assertEquals(expectedResult, fruitStorage.findApples(new AppleLightWeightPredicate()));
    }
}