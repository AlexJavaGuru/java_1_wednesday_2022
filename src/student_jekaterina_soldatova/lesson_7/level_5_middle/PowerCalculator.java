package student_jekaterina_soldatova.lesson_7.level_5_middle;

import java.util.Scanner;

import static java.lang.Math.abs;

class PowerCalculator {
    //get numbers
    //check if power > == < 0
    //exponentiation pos neg
    //print

    void run(int base, int power) {
        if (PowerCalculator.checkPower(power)) {
            int result = PowerCalculator.exponentiationPositive(base, power);
            PowerCalculator.printResult(result);
        } else {
            double result = PowerCalculator.exponentiationNegative(base, power);
            PowerCalculator.printResult(result);
        }
    }

    static boolean checkPower(int power) {
        return (power > -1);
    }

    static int exponentiationPositive(int base, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result = result * base;
        }
        return result;
    }

    static double exponentiationNegative(int base, int power) {
        int result = 1;
        for (int i = 0; i < abs(power); i++) {
            result = result * base;
        }
        return 1.0/result;
    }

    static void printResult(Object result) {
        System.out.println("Result of exponentiation is " + result);
    }
}
