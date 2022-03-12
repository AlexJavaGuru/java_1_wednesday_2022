package student_aleksandrs_korsaks.ak_lesson_7.level_1;

import java.util.Arrays;

class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFilterTextTest();
        wordServiceTest.shouldSeparateTextToWordsTest();
        wordServiceTest.shouldFindMostFrequentWordTest();
    }

    public void shouldFilterTextTest() {
        String text = "ok!@#$it)(   )is}|/  filte red";
        String expectedResult = "ok    it      is     filte red";
        String realResult = wordService.filterTextFromUnnecessaryCharactersPutThemInLowerCase(text);
        checkTestResult("shouldFilterTextTest", expectedResult.equals(realResult));
    }

    public void shouldSeparateTextToWordsTest() {
        String text = "ok!@#$it)()is}|/filtered";
        String[] expectedResult = {"ok", "it", "is", "filtered"};
        String[] realResult = wordService.separateTextToWords(text);
        checkTestResult("shouldSeparateTextToWordsTest", Arrays.equals(expectedResult, realResult));
    }

    public void shouldFindMostFrequentWordTest() {
        String text = "ok!@#$it)(it)is}|is/is-filtered";
        String expectedResult = "is";
        String realResult = wordService.findMostFrequentWord(text);
        checkTestResult("shouldFindMostFrequentWordTest", expectedResult.equals(realResult));
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
