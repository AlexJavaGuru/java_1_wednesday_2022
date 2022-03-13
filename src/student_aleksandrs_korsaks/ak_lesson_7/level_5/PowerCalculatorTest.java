package student_aleksandrs_korsaks.ak_lesson_7.level_5;

class PowerCalculatorTest {
    PowerCalculator powerCalculator = new PowerCalculator();

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

    }

//    public void numberZeroExponentZeroTest() {
//        double expectedResult = "is";
//        String realResult = wordService.findMostFrequentWord(text);
//        checkTestResult("shouldFindMostFrequentWordTest", expectedResult.equals(realResult));
//    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
