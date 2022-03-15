package student_jekaterina_soldatova.lesson06.level_3_junior;

class ArrayService {
    boolean arrayIncludesNumber(int[] arrayToCheck, int numberToCheck) {
        for (int i : arrayToCheck) {
            if (i == numberToCheck) {
                return true;
            }
        }
        return false;
    }

    int arrayIncludesNumberCountTimes(int[] arrayToCheck, int numberToCheck) {
        int numberOfTimes = 0;
        for (int i : arrayToCheck) {
            if (i == numberToCheck) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }

    void changeOneNumberInArrayFirst(int[] array, int numberToChange, int newNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToChange) {
                array[i] = newNumber;
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("No such number in the array");
        }
    }

    void changeOneNumberInArrayAllInstances(int[] array, int numberToChange, int newNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToChange) {
                array[i] = newNumber;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("No such number in the array");
        }
    }

    void reverseArray(int[] array) {
        int length = array.length;
        int temporaryHolder;

        for (int i = 0; i < length / 2; i++) {
            temporaryHolder = array[i];

            array[i] = array[(length - 1 - i)];
            array[(length - 1 - i)] = temporaryHolder;
        }

    }

    void sortArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                int min;
                if (array[i] >= array[j]) {
                    min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }
        }
    }
}