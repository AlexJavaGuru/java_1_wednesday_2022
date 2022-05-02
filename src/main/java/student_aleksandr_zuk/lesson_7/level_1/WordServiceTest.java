package student_aleksandr_zuk.lesson_7.level_1;

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
    public void textToArrayTest(){
        WordService wordService = new WordService();
        String[] actualResult = wordService.textToArray("One ONE one");
        String[] expectedResult = {"One", "One", "One"};
        checkResult(actualResult, expectedResult, "Text to array test");
    }
    public void countSameWordsTest(){
        WordService wordservice = new WordService();
        String text = "One one Two two Three three one";
        String[] textArray = wordservice.textToArray(text);
        int[] expectedResult = {2, 0, 3, 0, 0, 0, 0};
        int[] actualResult = wordservice.countSameWords(textArray);
        checkResult(actualResult, expectedResult, "Count same words test");
    }
    public void getMostFrequentTest(){
        WordService wordService = new WordService();
        String[] text = {"one", "one", "one", "two"};
        int[] countSameWords = wordService.countSameWords(text);
        int actualResult = wordService.getMostFrequentWord(text, countSameWords);
        int expectedResult = 0;
        checkResult(actualResult, expectedResult, "Number of most frequent word test");
    }
    public void findMostFrequentTest(){
        WordService wordService = new WordService();
        String actualResult = wordService.findMostFrequentWord("one ONE One Two two TWO");
        String expectedResult = "one";
        checkResult(actualResult, expectedResult, "Find most frequent word test");

    }
}
