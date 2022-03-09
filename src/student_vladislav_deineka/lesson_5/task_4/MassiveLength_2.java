package student_vladislav_deineka.lesson_5.task_4;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class MassiveLength_2 {
    public static void main(String[] args) {

        System.out.println("Enter array length: ");
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] numbers = new int[length];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            int randomInput = random.nextInt();
            numbers[i] = randomInput;

            System.out.println("Random massive: " + Arrays.toString(numbers));
        }
    }
}