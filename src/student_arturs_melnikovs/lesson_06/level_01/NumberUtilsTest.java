package student_arturs_melnikovs.lesson_06.level_01;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest tester = new NumberUtilsTest();
        tester.testIsEven();
    }

    public void testIsEven() {
        int even = 10;
        NumberUtils subject = new NumberUtils();
        boolean actualResult = subject.isEven(even);
        checkResult(actualResult, "If even test");
    }

    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
