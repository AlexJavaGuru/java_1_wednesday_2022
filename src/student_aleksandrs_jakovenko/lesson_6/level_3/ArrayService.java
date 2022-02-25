package student_aleksandrs_jakovenko.lesson_6.level_3;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == numberToSearch) {
                return true;
            }
            i++;
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

//Очень долго просидел, сломал голову и в итоге загуглил, переделал под себя...
    void revert(int[] arr) {
        int[] test = new int[arr.length];
        int size = arr.length;
        for (int i = 0; i < arr.length; i++) {
            test[size - 1] = arr[i];
            size = size - 1;
        }
        for (int j = 0; j < arr.length; j++) {
            arr[j] = test[j];
        }
    }

    void sortDesc(int[] arr) {

    }
}
