package student_nadezda_travkina.lesson4;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1, num2, operation);
        System.out.println("Result: " + result);
    }


    public static int getInt() {
        System.out.println("Type a number:");
        Scanner scanner = new Scanner(System.in);
        int num3 = scanner.nextInt();
        if (scanner.hasNextInt()) {
            num3 = scanner.nextInt();
        }
        return num3;
    }

    public static char getOperation() {
        System.out.println("Type operation:");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        if (scanner.hasNext()) {
            operation = scanner.next();
        }
        return getOperation();
    }

    public static int calc(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }
        return result;
    }

    public boolean isEven(int result) {
        if (result % 2 == 0) {
            return true;
        } else if (result % 2 != 0) {}

        return false;
    }

    public int maxOfTwoNumbers(int num3, int num4) {
        if (num3 > num4) {
        } else if (num3 < num4) {
        } else if (num3 == num4) {
        }
        return num3;
    }
}