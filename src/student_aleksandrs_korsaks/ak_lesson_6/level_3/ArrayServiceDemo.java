package student_aleksandrs_korsaks.ak_lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceDemo {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 0, 0, -1, -3};
        ArrayService arrayService = new ArrayService();
        arrayService.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        arrayService.sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
