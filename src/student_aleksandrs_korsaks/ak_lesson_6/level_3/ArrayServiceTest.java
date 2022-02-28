package student_aleksandrs_korsaks.ak_lesson_6.level_3;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();
        arrayServiceTest.containsPositiveTest();
        arrayServiceTest.containsNegativeTest();
        arrayServiceTest.countOfContainsPositiveTest();
        arrayServiceTest.countOfContainsNegativeTest();

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

    public void countOfContainsNegativeTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int expectedResult = 0;
        int realResult = arrayService.countOfContains(testArr, 0);
        checkTestResult("countOfContainsNegativeTest", expectedResult == realResult);
    }

    public void countOfContainsPositiveTest() {
        ArrayService arrayService = new ArrayService();
        int[] testArr = {1, 2, -1, 2, 5};
        int expectedResult = 2;
        int realResult = arrayService.countOfContains(testArr, 2);
        checkTestResult("countOfContainsPositiveTest", expectedResult == realResult);
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}
