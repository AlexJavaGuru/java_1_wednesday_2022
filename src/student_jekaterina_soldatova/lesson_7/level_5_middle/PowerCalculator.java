package student_jekaterina_soldatova.lesson_7.level_5_middle;

import java.util.Scanner;

import static java.lang.Math.abs;

class PowerCalculator {
    //get numbers
    //check if power > == < 0
    //exponentiation pos neg
    //print

    static int[] getNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number you want to exponentiate");
        int base = scanner.nextInt();
        System.out.println("Please enter the power to which to raise the number");
        int power = scanner.nextInt();
        return new int[]{base, power};
    }

    static boolean checkPower(int[] numbers) {
        return (numbers[1] > -1);
    }

    static int exponentiationPositive(int[] numbers) {
        int result = 1;
        for (int i = 0; i < numbers[1]; i++) {
            result = result * numbers[0];
        }
        return result;
    }

    static double exponentiationNegative(int[] numbers) {
        int result = 1;
        for (int i = 0; i < abs(numbers[1]); i++) {
            result = result * numbers[0];
        }
        return 1.0/result;
    }

    static void printResult(Object result) {
        System.out.println("Result of exponentiation is " + result);
    }
}
