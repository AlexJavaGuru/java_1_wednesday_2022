package student_arturs_melnikovs.lesson_10.level_04;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest tester = new UniqueWordFinderTest();
        tester.testFind1();
    }

    private void testFind1() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = " =Not a single A duplicate in, In this -> a NOT! duplicATE! text @#not";
        Set<String> expected = new HashSet<>();
        expected.add("not");
        expected.add("a");
        expected.add("single");
        expected.add("duplicate");
        expected.add("in");
        expected.add("this");
        expected.add("text");
        Set<String> actual = uniqueWordFinder.find(text);
        checkResult(expected.equals(actual));
    }

    private void checkResult(Boolean actualResult) {
        if (actualResult) {
            System.out.println("Test has passed");
        } else {
            System.out.println("Test has FAILED");
        }
    }
}
