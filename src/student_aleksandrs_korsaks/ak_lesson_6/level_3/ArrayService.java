package student_aleksandrs_korsaks.ak_lesson_6.level_3;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int number : arr) {
            if (number == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOfContains(int[] arr, int numberToCount) {
        int counter = 0;
        for (int number : arr) {
            if (number == numberToCount) {
                counter++;
            }
        }
        return counter;
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
}