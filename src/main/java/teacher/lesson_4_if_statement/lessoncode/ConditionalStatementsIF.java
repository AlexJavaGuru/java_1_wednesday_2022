package teacher.lesson_4_if_statement.lessoncode;

import java.util.Scanner;

public class ConditionalStatementsIF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your number..");
        int x = 10;

        //-15
        if (x < 0) {
            System.out.println("Value < 0");
        } else if (x > 0) {
            System.out.println("Value > 0");
        } else {
            System.out.println("Value = 0");
        }

        if (x >= 0 && x < 10) {
            System.out.println("x is between 0 and 9");
                  //true   &&   true
        } else if (x >= 10 && x < 20) {
            System.out.println("x is between 10 and 19");
        } else {
            System.out.println("x is out of range...");
        }

        boolean isWindOutside = true;
        boolean isGoodWeather = true;
        boolean isWeekEnd = true;

        if (isGoodWeather || isWeekEnd) {
            System.out.println("Mood is great!");
        }


        if (!isGoodWeather && isWindOutside) {
            System.out.println("I need my umbrella...");
        } else if (isGoodWeather) {
            System.out.println("Go for a walk without an umbrella");
        }

    }
}
