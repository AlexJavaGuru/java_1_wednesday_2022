package studen_natalja_isajeva.lesson_7.level_1;


import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();
        test.testCreateArrayWord();
        test.testCountWords();
        test.testGetMostFrequent();
        test.testFindMostFrequentWords();

    }

    public void testCreateArrayWord() {
        WordService wordService = new WordService();
        String[] actualResult = wordService.createArrayWords("word WORD woRd");
        String[] expectResult = {"word", "word", "word"};
        if (Arrays.equals(actualResult, expectResult)) {
            System.out.println("Test 1 ok");
        } else System.out.println("Test 1 fail");
    }

    public void testCountWords() {
        WordService wordService = new WordService();
        String text = "Word word Word book Red red";
        String[] textArray = wordService.createArrayWords(text);
        int[] actualResult = wordService.countWords(textArray);
        int[] expectResult = {2, 0, 0, 0, 1, 0};
        if (Arrays.equals(actualResult, expectResult)) {
            System.out.println("Test 2 ok");
        } else System.out.println("Test 2 fail");
    }

    public void testGetMostFrequent() {
        WordService wordService = new WordService();
        String[] text = {"Word", "word", "Word", "book", "Red", "red"};
        int[] countWords = wordService.countWords(text);
        int actualResult = wordService.getMostFrequentWord(text, countWords);
        int expectedResult = 0;
        if (expectedResult == actualResult) {
            System.out.println("Test 3 ok");
        } else System.out.println("Test 3 fail");

    }

    public void testFindMostFrequentWords() {
        WordService wordService = new WordService();
        String actualResult = wordService.findMostFrequentWord("Word word Word book Red red");
        String expectedResult = "word";
        if (expectedResult.equals(actualResult)) {
            System.out.println("Test 4 ok");
        } else System.out.println("Test 4 fail");

    }

}

