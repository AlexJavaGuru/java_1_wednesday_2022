package student_arturs_melnikovs.lesson_04.level_03;

import java.util.Scanner;

class TaskNine {
    public static void main(String[] args) {
        System.out.println("Введите 1ое число");
        Scanner scanner = new Scanner(System.in);
        double firstNum = scanner.nextDouble();

        System.out.println("Введите 2ое число");
        double secondNum = scanner.nextDouble();

        System.out.println("Введите 3ие число");
        double thirdNum = scanner.nextDouble();

        if(firstNum < secondNum && secondNum < thirdNum) {
            System.out.println("increasing");
        } else if(firstNum > secondNum && secondNum > thirdNum ) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }
}
