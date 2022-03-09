package student_jekaterina_soldatova.lesson_7.level_1_intern;

import java.util.Arrays;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();

        test.stringToArray();
        test.findMostFrequentWord();
        test.removeSpecialChars();
    }

    void stringToArray() {
        String[] expectedResult = {"huh", "joe", "waited", "for", "the", "train", "the", "train", "was", "late"};
        String[] realResult = WordService.stringToArray("Huh-   Joe waited for the train, the train was late!");
        if (compareArrays(expectedResult, realResult)) {
            System.out.println("string to array = OK");
        } else {
            System.out.println("string to array = FAIL");
            System.out.println(Arrays.toString(realResult));
        }
    }

    boolean compareArrays(String[] expectedResult, String[] realResult) {
        for (int i = 0; i < expectedResult.length; i++) {
            if (!expectedResult[i].equals(realResult[i])) {
                return false;
            }
        }
        return true;
    }

    void findMostFrequentWord() {
        String expectedResult = "the";
        String[] arrayToCheck = {"Huh", "Joe", "waited", "for", "the", "train", "the", "train", "was", "late"};
        String realResult = WordService.findMostFrequentWord(arrayToCheck);
        if (expectedResult.equals(realResult)) {
            System.out.println("find Most Frequent Word = OK");
        } else {
            System.out.println("find Most Frequent Word = FAIL");
            System.out.println(realResult);
        }
    }

    void removeSpecialChars() {
        String expectedResult = "somebody";
        String stringToCheck = ";,;'[][]'some-body//[;^^^&*(;'.!#&";
        String realResult = WordService.removeSpecialChars(stringToCheck);
        if (expectedResult.equals(realResult)) {
            System.out.println("removeSpecialChars = OK");
        } else {
            System.out.println("removeSpecialChars = FAIL");
            System.out.println(realResult);
        }
    }
}
