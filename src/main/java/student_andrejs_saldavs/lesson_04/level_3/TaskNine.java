package student_andrejs_saldavs.lesson_04.level_3;

import java.util.Scanner;

class TaskNine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first int: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second int: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third int: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber < secondNumber && secondNumber < thirdNumber) {
            System.out.println("Increasing");
        } else if (firstNumber > secondNumber && secondNumber > thirdNumber){
            System.out.println("Decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}
