package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && firstNumber != thirdNumber){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}