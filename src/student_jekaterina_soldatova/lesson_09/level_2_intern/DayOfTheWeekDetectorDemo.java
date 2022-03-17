package student_jekaterina_soldatova.lesson_09.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
       // DayOfTheWeekDetectorDemo getDayNameIfVersion = new DayOfTheWeekDetectorDemo(day);
        run();


    }

    static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1-7 number");
        return scanner.nextInt();
    }

    static void run() {
      //  DayOfTheWeekDetectorArrayVersion getDay = new DayOfTheWeekDetectorArrayVersion();
        int number = getNumberFromUser();
        String dayOfTheWeek = dayOfTheWeekDetector.detectDayName(number);
    }
}
