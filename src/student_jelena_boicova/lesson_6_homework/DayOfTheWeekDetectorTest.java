package student_jelena_boicova.lesson_6_homework;

public class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest test = new DayOfTheWeekDetectorTest();
        test.shouldReturnMonday();
        test.shouldReturnTuesday();
        test.shouldReturnWednesday();
        test.shouldReturnThursday();
        test.shouldReturnFriday();
        test.shouldReturnSaturday();
        test.shouldReturnSunday();

    }

    public void shouldReturnMonday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(1);
        String expectedResult = "Monday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Monday test = OK");
        } else {
            System.out.println ("Monday test = FAIL");
        }
    }

    public void shouldReturnTuesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(2);
        String expectedResult = "Tuesday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Tuesday test = OK");
        } else {
            System.out.println ("Tuesday test = FAIL");
        }
    }

    public void shouldReturnWednesday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(3);
        String expectedResult = "Wednesday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Wednesday test = OK");
        } else {
            System.out.println ("Wednesday test = FAIL");
        }
    }

    public void shouldReturnThursday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(4);
        String expectedResult = "Thursday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Thursday test = OK");
        } else {
            System.out.println ("Thursday test = FAIL");
        }
    }

    public void shouldReturnFriday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(5);
        String expectedResult = "Friday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Friday test = OK");
        } else {
            System.out.println ("Friday test = FAIL");
        }
    }

    public void shouldReturnSaturday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(6);
        String expectedResult = "Saturday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Saturday test = OK");
        } else {
            System.out.println ("Saturday test = FAIL");
        }
    }

    public void shouldReturnSunday(){
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        String actualResult = detector.findDayOfTheWeek(7);
        String expectedResult = "Sunday";
        if (actualResult.equals(expectedResult)){
            System.out.println ("Sunday test = OK");
        } else {
            System.out.println ("Sunday test = FAIL");
        }
    }
}