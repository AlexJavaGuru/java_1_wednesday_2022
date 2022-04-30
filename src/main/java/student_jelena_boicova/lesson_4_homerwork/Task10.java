package student_jelena_boicova.lesson_4_homerwork;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        if (firstNumber <= secondNumber && secondNumber < thirdNumber) {
            System.out.println(thirdNumber);

        } else if (firstNumber > secondNumber && firstNumber > thirdNumber){
            System.out.println(firstNumber);
        } else if (firstNumber <= thirdNumber && thirdNumber < secondNumber){
            System.out.println(secondNumber);
        } else if (firstNumber < thirdNumber && secondNumber < firstNumber){
            System.out.println(secondNumber);
        } else if (firstNumber < secondNumber && thirdNumber < secondNumber){
            System.out.println(secondNumber);
        }
    }
}