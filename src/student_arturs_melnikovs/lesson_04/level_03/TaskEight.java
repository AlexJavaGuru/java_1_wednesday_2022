package student_arturs_melnikovs.lesson_04.level_03;

import java.util.Scanner;

class TaskEight {
    public static void main(String[] args) {
        System.out.println("Введите 1ое число");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();

        System.out.println("Введите 2ое число");
        double secondNum = scanner.nextDouble();

        System.out.println("Введите 3ие число");
        double thirdNum = scanner.nextDouble();

        if(firstNum == secondNum && firstNum == thirdNum) {
            System.out.println("All numbers are equal");
        } else if(firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum ) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}
