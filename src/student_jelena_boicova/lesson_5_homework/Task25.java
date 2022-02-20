package student_jelena_boicova.lesson_5_homework;

import java.util.Arrays;
import java.util.Scanner;

public class Task25 {

    public static void main(String[] args) {
        System.out.println("Enter arrays length");
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [scanner.nextInt()];
        System.out.println("Fill the array");

        for (int i = 0; i < numbers.length; i++){
            numbers [i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
    }

}
