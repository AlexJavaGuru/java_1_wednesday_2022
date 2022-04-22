package student_aleksandrs_korsaks.ak_lesson_7.level_5;

import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        double result = powerCalculator.getExponentGetNumberCheckForExceptionMakeCalculation();
        System.out.println("Результат = " + result);

    }

    public double getExponentGetNumberCheckForExceptionMakeCalculation() {
        int exponent;
        int number;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число");
            number = scanner.nextInt();
            System.out.println("Введите степень");
            exponent = scanner.nextInt();
            if (!isUserInputValid(number, exponent)) {
                System.out.println("Операция не определена! Вероятно, вы попытались возвести ноль в отрицательную степень. Введите значения снова.");
                System.out.println();
            }
        } while (!isUserInputValid(number, exponent));

        return exponentiateNumberCase(number, exponent);
    }

    public boolean isUserInputValid(int number, int exponent) {
        return ((number != 0) && (exponent > 0));
    }

    public double exponentiateNumberCase(int number, int exponent) {
        double result;
        if ((number == 0) && (exponent == 0)) {
            result = 1;
        } else if (number == 0) {
            result = 0;
        } else if (exponent == 0) {
            result = 1;
        } else if (exponent > 0) {
            result = exponentiateNumber(number, exponent);
        } else {
            result = 1 / (double) (exponentiateNumber(number, exponent));
        }
        return Math.round(result * 1000.0) / 1000.0;
    }

    public int exponentiateNumber(int number, int exponent) {
        int result = 1;
        if (exponent < 0) {
            exponent *= -1;
        }
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
}
