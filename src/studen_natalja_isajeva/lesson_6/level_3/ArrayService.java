package studen_natalja_isajeva.lesson_6.level_3;


class ArrayService {
    //task 12
    boolean searchNumber(int[] array, int numberToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToFind) {
                return true;
            }
        }
        return false;
    }

    //task 13
    int countOccurrence(int[] array, int numberToSearch) {
        int number = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                number++;
            }
        }
        return number;
    }

    //task 14
    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    //task 15
    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int replace = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                replace++;
            }
        }
        return replace;
    }

}
