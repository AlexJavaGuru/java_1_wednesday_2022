package student_aleksandrs_korsaks.ak_lesson_7.level_7;

class WordServiceTest {

    WordService wordService = new WordService();

    public static void main(String[] args) {
        WordServiceTest wordServiceTest = new WordServiceTest();
        wordServiceTest.shouldFindMostFrequentWordTest1();
        wordServiceTest.shouldFindMostFrequentWordTest2();
    }

    public void shouldFindMostFrequentWordTest1() {
        String text = "is is ok is ok ok ok";
        String expectedResult = "ok";
        String realResult = wordService.findMostFrequentWord(text);
        checkTestResult("shouldFindMostFrequentWordTest1", expectedResult.equals(realResult));
    }

    public void shouldFindMostFrequentWordTest2() {
        String text = "ok ok is is is ok is ok";
        String expectedResult = "ok";
        String realResult = wordService.findMostFrequentWord(text);
        checkTestResult("shouldFindMostFrequentWordTest2", expectedResult.equals(realResult));
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}

