package student_arturs_melnikovs.lesson_06.level_02;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest tester = new DayOfTheWeekDetectorTest();
        tester.testFindDayOfTheWeekV1();
        tester.testFindDayOfTheWeekV2();
        tester.testFindDayOfTheWeekV3();
        tester.testFindDayOfTheWeekV4();
        tester.testFindDayOfTheWeekV5();
        tester.testFindDayOfTheWeekV6();
        tester.testFindDayOfTheWeekV7();
        tester.testFindDayOfTheWeekV8();
    }

    public void testFindDayOfTheWeekV1() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Monday";
        checkResult(expectedResult, actualResult, "Find day of the week test 1");
    }

    public void testFindDayOfTheWeekV2() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 2;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Tuesday";
        checkResult(expectedResult, actualResult, "Find day of the week test 2");
    }

    public void testFindDayOfTheWeekV3() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 3;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Wednesday";
        checkResult(expectedResult, actualResult, "Find day of the week test 3");
    }

    public void testFindDayOfTheWeekV4() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 4;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Thursday";
        checkResult(expectedResult, actualResult, "Find day of the week test 4");
    }

    public void testFindDayOfTheWeekV5() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 5;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Friday";
        checkResult(expectedResult, actualResult, "Find day of the week test 5");
    }

    public void testFindDayOfTheWeekV6() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 6;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Saturday";
        checkResult(expectedResult, actualResult, "Find day of the week test 6");
    }

    public void testFindDayOfTheWeekV7() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 7;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Sunday";
        checkResult(expectedResult, actualResult, "Find day of the week test 7");
    }

    public void testFindDayOfTheWeekV8() {
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 8;
        String actualResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Not correct day number";
        checkResult(expectedResult, actualResult, "Find day of the week test 8");
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
