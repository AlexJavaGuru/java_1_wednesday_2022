package student_andrejs_saldavs.lesson_06.level_3;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numbersToSearch) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numbersToSearch) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirstNumber(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAllNumbers(int[] arr, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                count++;
            }
        }
        return count;
    }

    void inversion(int[] arr) {
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[(arr.length - 1) - i];
        }
        for (int i = 0; i < tmp.length; i++) {
            arr[i] = tmp[i];
        }
    }

    void sortNumbers(int[] arr) {
        Arrays.sort(arr);
    }

}
