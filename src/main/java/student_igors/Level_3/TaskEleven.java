package student_igors.Level_3;

import java.util.Scanner;

public class TaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 1-st number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter 2-nd number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Please enter 3-rd number: ");
        int thirdNumber = scanner.nextInt();
        double averageNumber = (double) (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println("Average number is: " + averageNumber);

    }
}
