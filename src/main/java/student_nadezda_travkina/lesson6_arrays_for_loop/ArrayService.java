package student_nadezda_travkina.lesson6_arrays_for_loop;

import java.util.Random;

class ArrayService {

    public static int searchLiner(int[] array, int searchNumber) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchNumber) {
                return i;
            }
        }
        return -1;
    }

    public static void searchLiner() {
    }
}
