package student_jelena_boicova.lesson_6_homework;

import java.util.Scanner;

public class DayOfTheWeekDetector {

    public int getDayNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day number between 1 and 7: ");
        return scanner.nextInt();
    }

    public String findDayOfTheWeek(int dayNumber) {
        getDayNumberFromUser();
        return String.valueOf(getDayNumberFromUser());
    }
}