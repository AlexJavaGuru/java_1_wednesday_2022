package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Scanner;

class TaskEleven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int userInputOne = scanner.nextInt();
        System.out.println("Enter second number: ");
        int userInputTwo = scanner.nextInt();
        System.out.println("Enter third number: ");
        int userInputThree = scanner.nextInt();

        int[] numbers = new int[3];
        numbers[0] = userInputOne;
        numbers[1] = userInputTwo;
        numbers[2] = userInputThree;

        System.out.println(Arrays.toString(numbers));

    }

}
