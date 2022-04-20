package student_andrejs_saldavs.lesson_05.level_2;

import java.util.Arrays;
import java.util.Scanner;

class TaskEleven {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }

}
