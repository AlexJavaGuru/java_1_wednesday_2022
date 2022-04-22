package student_arturs_melnikovs.lesson_09.level_02;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest tester = new DayOfTheWeekDetectorTest();
        tester.testValidValues();
        tester.testInvalidValues();
    }

    public void testValidValues() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Sunday";
        String actualResult = subject.detectDayName(7);
        checkResult(expectedResult, actualResult, "Valid values test");
    }
    public void testInvalidValues() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String actualResult = subject.detectDayName(0);
        checkResult(expectedResult, actualResult, "Invalid values test");
    }


    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected result: " + expectedResult + ", but actual result is " + actualResult);
        }
    }
}
