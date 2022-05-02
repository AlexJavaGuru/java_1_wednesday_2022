package student_aleksandrs_korsaks.ak_lesson_6.level_1;

class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
    }

    public void isEvenTest() {
        NumberUtils numberUtils = new NumberUtils();
        boolean realResult = numberUtils.isEven(2);
        checkTestResult("isEvenTest", realResult);
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
