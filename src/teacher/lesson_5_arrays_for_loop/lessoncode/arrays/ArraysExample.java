package teacher.lesson_5_arrays_for_loop.lessoncode.arrays;


import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        numbers[9] = 9000;
        numbers[6] = 6000;
        numbers[5] = 5000;
        numbers[3] = 3000;
        numbers[1] = 1000;
        numbers[8] = 8000;

        System.out.println(Arrays.toString(numbers));
        numbers[9] = 1;

        System.out.println(Arrays.toString(numbers));

        int result = numbers[1] + numbers[8];

        System.out.println(result);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
