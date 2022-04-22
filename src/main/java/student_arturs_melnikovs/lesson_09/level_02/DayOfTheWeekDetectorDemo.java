package student_arturs_melnikovs.lesson_09.level_02;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector){
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo detector;

        detector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        detector.run();

        detector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        detector.run();

        detector = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        detector.run();
    }


    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number between 1 and 7");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }
}
