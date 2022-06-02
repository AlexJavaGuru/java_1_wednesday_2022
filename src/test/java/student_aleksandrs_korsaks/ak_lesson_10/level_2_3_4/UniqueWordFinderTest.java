package student_aleksandrs_korsaks.ak_lesson_10.level_2_3_4;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class UniqueWordFinderTest {

    UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();

    @Test
    void find() {
        Set<String> realResult = uniqueWordFinder.find("I am, - ;;;90 big Big goOd!@# big small,man yes.");
        Set<String> expectedResult = new HashSet<>(Arrays.asList("small", "big", "yes", "i", "man", "am", "good"));
        assertEquals(expectedResult,realResult);

    }
}