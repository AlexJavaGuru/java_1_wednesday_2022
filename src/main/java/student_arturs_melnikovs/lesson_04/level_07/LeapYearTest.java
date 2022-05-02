package student_arturs_melnikovs.lesson_04.level_07;

public class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();

        test.testLeapYear();
        test.testRegularYear();
        test.testLeapCentury();
        test.testRegularCentury();
    }

    void testLeapYear() {
        LeapYear test = new LeapYear();
        int year = 2020;
        boolean expectedResult = true;
        boolean actualResult = test.isLeapYear(year);
        checkResult(actualResult, "Leap year test");
    }
    void testRegularYear() {
        LeapYear test = new LeapYear();
        int year = 2021;
        boolean expectedResult = false;
        boolean actualResult = test.isLeapYear(year);
        checkResult(!actualResult, "Regular year test");
    }
    void testLeapCentury() {
        LeapYear test = new LeapYear();
        int year = 2000;
        boolean expectedResult = true;
        boolean actualResult = test.isLeapYear(year);
        checkResult(actualResult, "Leap century test");
    }
    void testRegularCentury() {
        LeapYear test = new LeapYear();
        int year = 1900;
        boolean expectedResult = true;
        boolean actualResult = test.isLeapYear(year);
        checkResult(!actualResult, "Regular century test");
    }

    void checkResult(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
