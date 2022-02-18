package student_aleksandrs_korsaks.ak_lesson_5.level_5;

class ArrayUtilTest {
    ArrayUtil arrayUtil = new ArrayUtil();

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray() {
        int expectedResult = 5;
        int[] realResult = arrayUtil.createArray(5);
        checkTestResult("shouldCreateArray", expectedResult == realResult.length);

    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }

}