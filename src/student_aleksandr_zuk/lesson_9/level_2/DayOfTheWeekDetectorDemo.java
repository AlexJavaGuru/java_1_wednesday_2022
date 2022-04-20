package student_aleksandr_zuk.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;


    public static void main(String[] args) {

        DayOfTheWeekDetectorDemo demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        demo.run();

        demo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        demo.run();
    }

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector day) {
        dayOfTheWeekDetector = day;
    }

    void run() {

        System.out.println("Please input a number between 1-7");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(day));
    }

}
