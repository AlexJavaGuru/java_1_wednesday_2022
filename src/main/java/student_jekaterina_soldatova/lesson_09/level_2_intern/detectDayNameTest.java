package student_jekaterina_soldatova.lesson_09.level_2_intern;

class detectDayNameTest {
    public static void main(String[] args) {

        detectDayNameTest test = new detectDayNameTest();

        test.ifTrue();
        test.ifFalse();

        test.switchTrue();
        test.switchFalse();

        test.arrayTrue();
        test.arrayFalse();
    }

    void ifTrue(){
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Monday";
        String realResult = ifVersion.detectDayName(1);
        if (expectedResult.equals(realResult)) {
            System.out.println("if version true - ok");
        } else {
            System.out.println("if version true - fail, result is " + realResult);
        }
    }

    void ifFalse(){
        DayOfTheWeekDetectorIfVersion ifVersion = new DayOfTheWeekDetectorIfVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = ifVersion.detectDayName(9);
        if (expectedResult.equals(realResult)) {
            System.out.println("if version false - ok");
        } else {
            System.out.println("if version false - fail, result is " + realResult);
        }
    }


    void switchTrue(){
        DayOfTheWeekDetectorSwitchVersion ifVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Monday";
        String realResult = ifVersion.detectDayName(1);
        if (expectedResult.equals(realResult)) {
            System.out.println("switch version true - ok");
        } else {
            System.out.println("switch version true - fail, result is " + realResult);
        }
    }

    void switchFalse(){
        DayOfTheWeekDetectorSwitchVersion ifVersion = new DayOfTheWeekDetectorSwitchVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = ifVersion.detectDayName(9);
        if (expectedResult.equals(realResult)) {
            System.out.println("switch version false - ok");
        } else {
            System.out.println("switch version false - fail, result is " + realResult);
        }
    }


    void arrayTrue(){
        DayOfTheWeekDetectorArrayVersion ifVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Monday";
        String realResult = ifVersion.detectDayName(1);
        if (expectedResult.equals(realResult)) {
            System.out.println("array version true - ok");
        } else {
            System.out.println("array version true - fail, result is " + realResult);
        }
    }

    void arrayFalse(){
        DayOfTheWeekDetectorArrayVersion ifVersion = new DayOfTheWeekDetectorArrayVersion();
        String expectedResult = "Please input a valid number between 1 and 7";
        String realResult = ifVersion.detectDayName(9);
        if (expectedResult.equals(realResult)) {
            System.out.println("array version false - ok");
        } else {
            System.out.println("array version false - fail, result is " + realResult);
        }
    }

}


