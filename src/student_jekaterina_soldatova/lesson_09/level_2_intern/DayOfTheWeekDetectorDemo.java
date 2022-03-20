package student_jekaterina_soldatova.lesson_09.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        run();
    }

    static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1-7 number");
        return scanner.nextInt();
    }

    static void run() {
        int number = getNumberFromUser();
        getDayIfs(number);
        getDaySwitch(number);
        getDayArray(number);
    }

    static void getDayIfs(int number) {
        DayOfTheWeekDetectorIfVersion getDayArray = new DayOfTheWeekDetectorIfVersion();
        String dayOfTheWeek = getDayArray.detectDayName(number);
        System.out.println("if version: " + dayOfTheWeek);
    }

    static void getDaySwitch(int number) {
        DayOfTheWeekDetectorSwitchVersion getDayArray = new DayOfTheWeekDetectorSwitchVersion();
        String dayOfTheWeek = getDayArray.detectDayName(number);
        System.out.println("switch version: " + dayOfTheWeek);
    }

    static void getDayArray(int number) {
        DayOfTheWeekDetectorArrayVersion getDayArray = new DayOfTheWeekDetectorArrayVersion();
        String dayOfTheWeek = getDayArray.detectDayName(number);
        System.out.println("array version: " + dayOfTheWeek);
    }

}
