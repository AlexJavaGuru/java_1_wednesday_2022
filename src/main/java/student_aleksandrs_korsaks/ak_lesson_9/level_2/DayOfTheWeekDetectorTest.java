package student_aleksandrs_korsaks.ak_lesson_9.level_2;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();

        dayOfTheWeekDetectorTest.dayOfTheWeekOutOfRangeIfVersionNegativeTest1();
        dayOfTheWeekDetectorTest.dayOfTheWeekOutOfRangeIfVersionNegativeTest2();
        dayOfTheWeekDetectorTest.dayOfTheWeekIfVersionTest();

        dayOfTheWeekDetectorTest.dayOfTheWeekOutOfRangeSwitchVersionNegativeTest1();
        dayOfTheWeekDetectorTest.dayOfTheWeekOutOfRangeSwitchVersionNegativeTest2();
        dayOfTheWeekDetectorTest.dayOfTheWeekSwitchVersionTest();

        dayOfTheWeekDetectorTest.dayOfTheWeekOutOfRangeArrayVersionNegativeTest1();
        dayOfTheWeekDetectorTest.dayOfTheWeekOutOfRangeArrayVersionNegativeTest2();
        dayOfTheWeekDetectorTest.dayOfTheWeekArrayVersionTest();

    }

    public void dayOfTheWeekOutOfRangeIfVersionNegativeTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(0);
        checkTestResult("dayOfTheWeekOutOfRangeIfVersionNegativeTest1", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekOutOfRangeIfVersionNegativeTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(8);
        checkTestResult("dayOfTheWeekOutOfRangeIfVersionNegativeTest2", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekIfVersionTest() {
        DayOfTheWeekDetector dayOfTheWeekDetectorIfVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Monday";
        String realResult = dayOfTheWeekDetectorIfVersion.detectDayName(1);
        checkTestResult("dayOfTheWeekIfVersionTest", expectedResult.equals(realResult));
    }


    public void dayOfTheWeekOutOfRangeSwitchVersionNegativeTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(0);
        checkTestResult("dayOfTheWeekOutOfRangeSwitchVersionNegativeTest1", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekOutOfRangeSwitchVersionNegativeTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(8);
        checkTestResult("dayOfTheWeekOutOfRangeSwitchVersionNegativeTest2", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekSwitchVersionTest() {
        DayOfTheWeekDetector dayOfTheWeekDetectorSwitchVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetectorSwitchVersion.detectDayName(2);
        checkTestResult("dayOfTheWeekSwitchVersionTest", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekOutOfRangeArrayVersionNegativeTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(0);
        checkTestResult("dayOfTheWeekOutOfRangeArrayVersionNegativeTest1", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekOutOfRangeArrayVersionNegativeTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(8);
        checkTestResult("dayOfTheWeekOutOfRangeArrayVersionNegativeTest2", expectedResult.equals(realResult));
    }

    public void dayOfTheWeekArrayVersionTest() {
        DayOfTheWeekDetector dayOfTheWeekDetectorArrayVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Wednesday";
        String realResult = dayOfTheWeekDetectorArrayVersion.detectDayName(3);
        checkTestResult("dayOfTheWeekArrayVersionTest", expectedResult.equalsIgnoreCase(realResult));
    }

    public void checkTestResult(String testName, boolean condition) {
        if (condition) {
            System.out.println("'" + testName + "'" + " test is OK");
        } else {
            System.out.println("'" + testName + "'" + " test is FAIL");
        }
    }
}
