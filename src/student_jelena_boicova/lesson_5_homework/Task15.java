package student_jelena_boicova.lesson_5_homework;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {
        int [] numbers = new int[3];
        Random random = new Random();
        numbers[0] = random.nextInt();
        numbers[1] = random.nextInt();
        numbers[2] = random.nextInt();
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[0]+2);
        System.out.println(numbers[1]+2);
        System.out.println(numbers[2]+2);
    }
}
