package student_andrejs_saldavs.lesson_07.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.findMostFrequentWordTest();
        wordServiceTest.createArrayTest();
        wordServiceTest.duplicateCounterTest();
        wordServiceTest.mostFrequentWordPlaceTest();
    }

    public void findMostFrequentWordTest() {
        WordService test = new WordService();
        String text = "One one two three four two one";
        String expectedResult = "one";
        String actualResult = test.findMostFrequentWord(text);
        checkResult(expectedResult, actualResult, "Finding most frequent word test");
    }

    public void createArrayTest() {
        WordService test = new WordService();
        String text = "One one two three four two one";
        String[] expectedResult = {"one", "one", "two", "three", "four", "two", "one"};
        String[] actualResult = test.createArray(text);
        checkResult(expectedResult, actualResult, "Creating array test");
    }

    public void duplicateCounterTest() {
        WordService test = new WordService();
        String text = "One one two Three four two One";
        int[] expectedResult = {2, 0, 1, 0, 0, 0, 0};
        int[] actualResult = test.duplicateCounter(test.createArray(text));
        checkResult(expectedResult, actualResult, "Duplicate counter test");
    }

    public void mostFrequentWordPlaceTest() {
        WordService test = new WordService();
        String text = "One one two Three four two One";
        String[] arrayWords = test.createArray(text);
        int[] countOfDuplicates = test.duplicateCounter(arrayWords);
        int expectedResult = 0;
        int actualResult = test.mostFrequentWordPlace(arrayWords, countOfDuplicates);
        checkResult(expectedResult, actualResult, "Finding most frequent word place test");
    }

    void checkResult(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult +  " but actual is " + actualResult);
        }
    }

    void checkResult(int[] expectedResult, int[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + Arrays.toString(expectedResult) +  " but actual is " + Arrays.toString(actualResult));
        }
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + expectedResult +  " but actual is " + actualResult);
        }
    }

    void checkResult(String[] expectedResult, String[] actualResult, String testName) {
        if (Arrays.equals(expectedResult, actualResult)) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed... Expected result was " + Arrays.toString(expectedResult) + " but actual is " + Arrays.toString(actualResult));
        }
    }

}
