package student_jelena_boicova.lesson_6_homework;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
    }

    public void shouldReturnMonday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = 1;
        String actualResult = detector.findDayOfTheWeek(dayNumber);
        String expectedResult = "Monday";
        if (actualResult == expectedResult){
            System.out.println ("Monday test = OK");
        } else {
            System.out.println ("Monday test = FAIL");
        }
    }
}