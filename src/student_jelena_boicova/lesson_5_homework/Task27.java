package student_jelena_boicova.lesson_5_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        System.out.println("Enter arrays length");
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int [scanner.nextInt()];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++){
            numbers [i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int maxNum = numbers[0];

        for (int i : numbers){
            if (i > maxNum)
                maxNum = i;
        }
        System.out.println("Maximum number = " + maxNum);
    }
}
