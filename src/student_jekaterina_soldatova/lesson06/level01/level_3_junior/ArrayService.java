package student_jekaterina_soldatova.lesson06.level01.level_3_junior;

import java.util.Arrays;

class ArrayService {
    boolean ArrayIncludesNumber(int[] arrayToCheck, int numberToCheck){
        for (int i: arrayToCheck) {
            if (i == numberToCheck) {
                return true;
            }
        }
        return false;
    }

    int ArrayIncludesNumberCountTimes(int[] arrayToCheck, int numberToCheck){
        int numberOfTimes = 0;
        for (int i: arrayToCheck) {
            if (i == numberToCheck) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }

    void ChangeOneNumberInArrayFirst(int[] array, int numberToChange, int newNumber){
        for (int i: array) {
            if (i == numberToChange) {
                i = newNumber;
                break;
            }
        }
    }

    void ChangeOneNumberInArrayAllInstances(int[] array, int numberToChange, int newNumber){
        for (int i: array) {
            if (i == numberToChange) {
                i = newNumber;
            }
        }
    }

    void ReverseArray(int[] array){
        int arrayLength = array.length;
        int[] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[arrayLength-1-i] = array[i];
        }
    }

    void SortArray(int[] array){
        Arrays.sort(array);
    }
}
