package student_nikita_visnakov.nv_lesson6;

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

    public void testFindDayOfTheWeekV1(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Monday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N1 " );
    }
    public void testFindDayOfTheWeekV2(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 2;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Tuesday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N2 " );
    }
    public void testFindDayOfTheWeekV3(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 3;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Wednesday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N3 " );
    }
    public void testFindDayOfTheWeekV4(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 4;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Thursday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N4 " );
    }
    public void testFindDayOfTheWeekV5(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 5;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Friday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N5 " );
    }
    public void testFindDayOfTheWeekV6(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 6;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Saturday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N6 " );
    }
    public void testFindDayOfTheWeekV7(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 7;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Sunday";
        checkResult(expectedResult, NeededResult, "Find day of the week test N7 " );
    }
    public void testFindDayOfTheWeekV8(){
        DayOfTheWeekDetector subject = new DayOfTheWeekDetector();
        int dayNumber = 8;
        String NeededResult = subject.findDayOfTheWeek(dayNumber);
        String expectedResult = "Not correct day number";
        checkResult(expectedResult, NeededResult, "Find day of the week test N8 " );
    }

     void checkResult(String expectedResult, String neededResult, String testName) {
        if (expectedResult.equals(neededResult)) {
            System.out.println(testName = " correct ");
        } else {
            System.out.println(testName + "Failed");
        }
    }

}
