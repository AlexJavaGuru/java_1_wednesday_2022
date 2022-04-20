package student_andrejs_saldavs.lesson_04.level_2;

import java.util.Scanner;

class LevelTwoTasks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first int: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second int: ");
        int secondNumber = scanner.nextInt();

        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " is greater");
            System.out.println(secondNumber + " is less");
            System.out.println("Numbers are different");
        } else if (firstNumber < secondNumber) {
            System.out.println(secondNumber + " is greater");
            System.out.println(firstNumber + " is less");
            System.out.println("Numbers are different");
        } else {
            System.out.println("Numbers are equal");
        }
    }

}
