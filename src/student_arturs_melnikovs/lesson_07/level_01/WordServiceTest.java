package student_arturs_melnikovs.lesson_07.level_01;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest tester = new WordServiceTest();
        tester.testCountDuplicatesV1();
        tester.testCountDuplicatesV2();
        tester.testSplitTextToLowerCase();
        tester.testGetMostFrequentWord();
        tester.testFindMostFrequentWord();
    }

    public void testFindMostFrequentWord() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz Buzz";
        String expectedResult = "fizz";
        String actualResult = subject.findMostFrequentWord(text);
        checkResult(expectedResult, actualResult, "Find most frequent word test");
    }

    public void testGetMostFrequentWord() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz Buzz";
        String[] words = subject.splitTextInLowerCase(text);
        int[] duplicatesCount = subject.countDuplicates(words);
        String expectedResult = "fizz";
        String actualResult = subject.getMostFrequentWord(words, duplicatesCount);
        checkResult(expectedResult, actualResult, "Get most frequent word test");
    }

    public void testSplitTextToLowerCase() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz";
        String[] expectedResult = {"fizzbuzz", "fizz", "fizz", "buzz", "fizz", "buzz"};
        String[] actualResult = subject.splitTextInLowerCase(text);
        checkResult(expectedResult, actualResult, "Split text to lower case test");
    }
    public void testCountDuplicatesV1() {
        WordService subject = new WordService();
        String text = "FizzBuzz Fizz fizz Buzz fizz buzz";
        String[] words = subject.splitTextInLowerCase(text);
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
}
