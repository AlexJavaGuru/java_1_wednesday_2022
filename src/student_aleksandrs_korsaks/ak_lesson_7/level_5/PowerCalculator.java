package student_aleksandrs_korsaks.ak_lesson_7.level_5;

import java.util.Scanner;

class PowerCalculator {
    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        double result = powerCalculator.getExponentGetNumberCheckForExceptionMakeCalculation();
        System.out.println("The result  = " + result);

    }
    public double getExponentGetNumberCheckForExceptionMakeCalculation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number");
        int number = scanner.nextInt();
        System.out.println("Please input the exponent");
        int exponent = scanner.nextInt();
        if ((number == 0) && (exponent < 0)){

        }

        return exponentiateNumberCase(number,exponent);
    }

    public double exponentiateNumberCase(int number, int exponent) {
        double result = 0;
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
