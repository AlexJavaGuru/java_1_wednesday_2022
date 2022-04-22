package student_aleksandrs_korsaks.ak_lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoIf = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemoIf.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoSwitch = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorDemoSwitch.run();

        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemoArray = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        dayOfTheWeekDetectorDemoArray.run();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please chose day from 1 - 7");
        int dayOfWeek = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(dayOfWeek));
    }
}
