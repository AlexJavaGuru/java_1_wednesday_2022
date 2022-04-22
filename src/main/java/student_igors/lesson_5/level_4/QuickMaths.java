package student_igors.lesson_5.level_4;

public class QuickMaths {
    public static int max(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("[" + i + "] = " + array[i]);

        }
    }
}
