package student_aleksandrs_jakovenko.lesson_6.level_3;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int result = 0;
        int i = 0;

        while (i < arr.length) {
            if (numberToSearch == arr[i]) {
                result++;
            }
            i++;
        }
        return result;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (numberToReplace == arr[i]) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (numberToReplace == arr[i]) {
                arr[i] = newNumber;
                result++;
            }
        }
        return result;
    }

    void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }

    void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
