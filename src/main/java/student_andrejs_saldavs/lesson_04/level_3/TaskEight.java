package student_andrejs_saldavs.lesson_04.level_3;

import java.util.Scanner;

class TaskEight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first int: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second int: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third int: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == thirdNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != thirdNumber && secondNumber != thirdNumber && firstNumber != secondNumber){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

}
