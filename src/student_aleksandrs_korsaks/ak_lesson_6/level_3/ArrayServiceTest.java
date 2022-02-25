package student_aleksandrs_korsaks.ak_lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsPositiveTest();
        arrayServiceTest.containsNegativeTest();

    }

    public void containsPositiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 4, 5};
        boolean result = arrayService.contains(testArr, 4);
        checkTestResult("containsPositiveTest", result);
    }

    public void containsNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 4, 5};
        boolean result = !arrayService.contains(testArr, 0);
        checkTestResult("containsPositiveTest", result);
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
