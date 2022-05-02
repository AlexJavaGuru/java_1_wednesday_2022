package student_aleksandrs_korsaks.ak_lesson_6.level_2;

class DayOfTheWeekDetectorTest {
    public static void main(String[] args) {
        DayOfTheWeekDetectorTest dayOfTheWeekDetectorTest = new DayOfTheWeekDetectorTest();
        dayOfTheWeekDetectorTest.findDayOfTheWeekOutOfBoundTest1();
        dayOfTheWeekDetectorTest.findDayOfTheWeekOutOfBoundTest2();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest1();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest2();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest3();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest4();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest5();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest6();
        dayOfTheWeekDetectorTest.findDayOfTheWeekTest7();
    }

    public void findDayOfTheWeekOutOfBoundTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Not correct day number";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(0);
        checkTestResult("findDayOfTheWeekOutOfBoundTest1", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekOutOfBoundTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Not correct day number";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(8);
        checkTestResult("findDayOfTheWeekOutOfBoundTest2", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest1() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Monday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(1);
        checkTestResult("findDayOfTheWeekTest1", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest2() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Tuesday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(2);
        checkTestResult("findDayOfTheWeekTest2", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest3() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Wednesday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(3);
        checkTestResult("findDayOfTheWeekTest3", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest4() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Thursday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(4);
        checkTestResult("findDayOfTheWeekTest4", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest5() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Friday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(5);
        checkTestResult("findDayOfTheWeekTest5", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest6() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Saturday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(6);
        checkTestResult("findDayOfTheWeekTest6", expectedResult.equals(realResult));
    }

    public void findDayOfTheWeekTest7() {
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Sunday";
        String realResult = dayOfTheWeekDetector.findDayOfTheWeek(7);
        checkTestResult("findDayOfTheWeekTest7", expectedResult.equals(realResult));
    }

    public void checkTestResult(String testName, boolean result) {
        if (result) {
            System.out.println("\"" + testName + "\"" + " test = OK");
        } else {
            System.out.println("\"" + testName + "\"" + " test = FAIL");
        }
    }
}

