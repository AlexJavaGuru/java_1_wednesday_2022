package student_aleksandrs_jakovenko.lesson_9.level_2;

class DayOfTheWeekDetectorSwitchVersionTest {

    public static void main(String[] args) {

        DayOfTheWeekDetectorSwitchVersionTest test = new DayOfTheWeekDetectorSwitchVersionTest();
        test.fridayTest();
        test.notDayTest();
    }

    public void fridayTest () {
        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        String actualResult = day.detectDayName(5);
        String expectedResult = "Friday";
        checkResult(actualResult, expectedResult, "Friday test");
    }

    public void notDayTest () {
        DayOfTheWeekDetectorIfVersion day = new DayOfTheWeekDetectorIfVersion();
        String actualResult = day.detectDayName(10);
        String expectedResult = "Please input a valid number between 1 and 7";
        checkResult(actualResult, expectedResult, "Not day test");
    }

    public void checkResult(String actualResult, String expectedResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " = OK");
        } else System.out.println(testName + " = FAIL");
    }
}
