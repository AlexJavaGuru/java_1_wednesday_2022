package student_aleksandrs_jakovenko.lesson_4.level_3;

import java.util.Scanner;

class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int thirdNum = scanner.nextInt();

        if (firstNum > secondNum && firstNum > thirdNum){
            System.out.println(firstNum);
        }
        else if (secondNum > firstNum && secondNum > thirdNum){
            System.out.println(secondNum);
        }
        else if (thirdNum > firstNum && thirdNum > secondNum){
            System.out.println(thirdNum);
        }
        else if (secondNum == thirdNum && firstNum < secondNum){
            System.out.println(secondNum);
        }
        else if (firstNum == secondNum && thirdNum < firstNum){
            System.out.println(firstNum);
        }
        else System.out.println(firstNum);
    }
}
