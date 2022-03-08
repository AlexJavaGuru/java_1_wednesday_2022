package student_jekaterina_soldatova.lesson_7.level_1_intern;

class WordServiceTest {
    public static void main(String[] args) {
        WordServiceTest test = new WordServiceTest();

        test.stringToArray();
        test.findMostFrequentWord();
    }

    void stringToArray() {
        String[] expectedResult = {"Huh", "Joe", "waited", "for", "the", "train", "the", "train", "was", "late"};
        String[] realResult = WordService.stringToArray("Huh - Joe waited for the train, the train was late!");
        if (compareArrays(expectedResult, realResult)) {
            System.out.println("string to array = OK");
        } else {
            System.out.println("string to array = FAIL");
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
}
