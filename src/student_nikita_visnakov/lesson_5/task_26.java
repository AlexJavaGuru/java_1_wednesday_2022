package student_nikita_visnakov.lesson_5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task_26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Arrays length...");
        int size = scanner.nextInt();

        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            Random random = new Random();
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }
}
