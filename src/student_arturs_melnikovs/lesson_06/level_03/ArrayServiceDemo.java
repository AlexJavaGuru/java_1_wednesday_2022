package student_arturs_melnikovs.lesson_06.level_03;

import java.util.Arrays;

class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService test = new ArrayService();
        int[] arr = {1, 2, 3, 4, 5};
        test.revert(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {2, 5, 6, 3, 1, -2, 4, 5, 6, 3};
        test.sortAscending(arr1);
        System.out.println(Arrays.toString(arr1));
    }
}
