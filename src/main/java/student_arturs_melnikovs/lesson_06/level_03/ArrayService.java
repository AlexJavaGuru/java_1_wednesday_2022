package student_arturs_melnikovs.lesson_06.level_03;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToCount) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToCount) {
                count++;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] arr, int searchedNumber, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchedNumber) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int replaceCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                replaceCount++;
            }
        }
        return replaceCount;
    }

    void revert(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[(arr.length - 1) - i];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

}
