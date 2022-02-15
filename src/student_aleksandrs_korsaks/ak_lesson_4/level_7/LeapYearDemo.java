package student_aleksandrs_korsaks.ak_lesson_4.level_7;

import java.util.Scanner;

class LeapYearDemo {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Year");
        int year = scanner.nextInt();
        System.out.println("Variant - 1 " + leapYear.isLeapYear(year));
        System.out.println("Variant - 2 " + leapYear.isLeapYearTwo(year));
        System.out.println("Variant - 3 " + leapYear.isLeapYearThree(year));
    }
}
