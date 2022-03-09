package student_jelena_boicova.lesson_6_homework;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.findMonday();
    }

    public void findMonday (){
        DayOfTheWeekDetector result = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String actualResult = result.findDayOfTheWeek(dayNumber);
        String expectedResult = "Monday";
        checkResult(expectedResult, actualResult, "Find day of the week TEST Monday");
    }
}