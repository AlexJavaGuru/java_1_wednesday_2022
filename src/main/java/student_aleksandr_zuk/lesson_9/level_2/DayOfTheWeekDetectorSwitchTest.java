package student_aleksandr_zuk.lesson_9.level_2;

class DayOfTheWeekDetectorSwitchTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorSwitchTest test = new DayOfTheWeekDetectorSwitchTest();
        test.mondayTest();
        test.wrongDayTest();
    }

    void checkResult(String expectedResult, String actualResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " = OK");
        } else {
            System.out.println(testName + " = FAIL");
        }
    }
    public void mondayTest() {
        DayOfTheWeekDetectorSwitchVersion day = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = day.detectDayName(1);
        String expectedResult = "Monday";
        checkResult(expectedResult,actualResult,"Monday test");
    }
    public void wrongDayTest() {
        DayOfTheWeekDetectorSwitchVersion day = new DayOfTheWeekDetectorSwitchVersion();
        String actualResult = day.detectDayName(8);
        String expectedResult = "Please input a valid number between 1-7";
        checkResult(expectedResult,actualResult,"Wrong day test");
    }
}
