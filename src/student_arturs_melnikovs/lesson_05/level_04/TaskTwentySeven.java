package student_arturs_melnikovs.lesson_05.level_04;

import java.util.Arrays;
import java.util.Random;

class TaskTwentySeven {

    public static void main(String[] args) {
        int[] numbers = new int[50];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        int maxNumber = numbers[0];

        for (int number : numbers) {
            if(number > maxNumber) {
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }

}
