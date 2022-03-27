package student_jekaterina_soldatova.lesson_7.level_5_middle;

import java.util.Scanner;

class PowerCalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number you want to exponentiate");
        int base = scanner.nextInt();
        System.out.println("Please enter the power to which to raise the number");
        int power = scanner.nextInt();

        PowerCalculator calculate = new PowerCalculator();

        calculate.run(base, power);
    }
}
