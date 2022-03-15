package student_aleksandrs_jakovenko.lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.textToArrayTest();
        test.countSameWordsTest();
        test.getMostFrequentTest();
        test.findMostFrequentTest();
    }

    public void checkResult(String actualResult, String expectedResult, String testName){
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(String[] actualResult, String[] expectedResult, String testName){
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(int[] actualResult, int[] expectedResult, String testName){
        if (Arrays.equals(actualResult, expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void checkResult(int actualResult, int expectedResult, String testName){
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }

    public void textToArrayTest() {
        WordService wordService = new WordService();
        String[] actualResult = wordService.textToArray("One ONE oNe");
        String[] expectedResult = {"one", "one", "one"};
        checkResult(actualResult, expectedResult, "Text to Array test");
    }

    public void countSameWordsTest() {
        WordService wordService = new WordService();
        String text = "One one ONE two THRee three one three";
        String[] textArray = wordService.textToArray(text);
        int[] expectedResult = {3, 0, 0, 0, 2, 0, 0, 0};
        int[] actualResult = wordService.countSameWords(textArray);
        checkResult(actualResult, expectedResult, "Count same words test");
    }

    public void getMostFrequentTest () {
        WordService wordService = new WordService();
        String[] text = {"one", "one", "one", "two", "three", "three"};
        int[] countSameWords = wordService.countSameWords(text);
        int actualResult = wordService.getMostFrequentWord(text, countSameWords);
        int expectedResult = 0;
        checkResult(actualResult, expectedResult, "Number of most frequent word test");
    }

    public void findMostFrequentTest () {
        WordService wordService = new WordService();
        String actualResult = wordService.findMostFrequentWord("One one ONE two THRee three");
        String expectedResult = "one";
        checkResult(actualResult, expectedResult, "Find most frequent word test");
    }
}
