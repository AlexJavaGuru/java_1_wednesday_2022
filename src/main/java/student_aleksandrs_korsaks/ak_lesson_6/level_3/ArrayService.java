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

    int replaceAllNumbers(int[] arr, int numberToReplace, int newNumber) {
        int numbersReplacedCounter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                numbersReplacedCounter++;
            }
        }
        return numbersReplacedCounter;
    }

    void reverseArray(int[] arr) {
        int[] tempArr = new int[arr.length];
        int j = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            tempArr[j] = arr[i];
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = tempArr[i];
        }
    }

    void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp;
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}