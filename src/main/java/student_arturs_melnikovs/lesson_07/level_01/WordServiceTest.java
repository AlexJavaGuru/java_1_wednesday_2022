package student_arturs_melnikovs.lesson_07.level_01;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest tester = new WordServiceTest();
        tester.testCountDuplicatesV1();
        tester.testCountDuplicatesV2();
        tester.testCreateArrayOfWords();
        tester.testLocateMostFrequentWord();
        tester.testFindMostFrequentWord();
    }

    public void testFindMostFrequentWord() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz Buzz";
        String expectedResult = "fizz";
        String actualResult = subject.findMostFrequentWord(text);
        checkResult(expectedResult, actualResult, "Find most frequent word test");
    }

    public void testLocateMostFrequentWord() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz Buzz";
        String[] words = subject.createArrayOfWords(text);
        int[] duplicatesCount = subject.countDuplicates(words);
        int expectedResult = 1;
        int actualResult = subject.locateMostFrequentWord(words, duplicatesCount);
        checkResult(expectedResult, actualResult, "Locate most frequent word test");
    }

    public void testCreateArrayOfWords() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz";
        String[] expectedResult = {"fizzbuzz", "fizz", "fizz", "buzz", "fizz", "buzz"};
        String[] actualResult = subject.createArrayOfWords(text);
        checkResult(expectedResult, actualResult, "Create array test");
    }
    public void testCountDuplicatesV1() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz";
        String[] words = subject.createArrayOfWords(text);
        int[] expectedResult = {0, 2, 0, 1, 0, 0};
        int[] actualResult = subject.countDuplicates(words);
        checkResult(expectedResult, actualResult, "Count duplicates test 1");
    }
    public void testCountDuplicatesV2() {
        WordService subject = new WordService();
        String testText = "Not a single duplicate in sight";
        int[] expectedResult = {0, 0, 0, 0, 0, 0};
        int[] actualResult = subject.countDuplicates(testText.split(" "));
        checkResult(expectedResult, actualResult, "Count duplicates test 2");
    }

    public void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if(Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    public void checkResult(String[] expectedResult, String[] actualResult, String testName) {
        if(Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }public void checkResult(String expectedResult, String actualResult, String testName) {
        if(expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
    public void checkResult(int expectedResult, int actualResult, String testName) {
        if(expectedResult == actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
