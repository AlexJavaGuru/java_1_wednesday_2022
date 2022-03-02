package student_andrejs_saldavs.lesson_04.level_3;

import java.util.Scanner;

class TaskTen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first int: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second int: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third int: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber + " is the greatest number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println(secondNumber + " is the greatest number");
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            System.out.println(thirdNumber + " is the greatest number");
        }
    }

}
