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
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToChange) {
                array[i] = newNumber;
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
        int length = array.length;
        int[] copiedArray = array;
        System.out.println(Arrays.toString(copiedArray) + " copied array");

        for (int i = 0; i < (length); i++) {
            System.out.println(Arrays.toString(copiedArray) + " - iteration " + i);

            array[i] = copiedArray[(length-1-i)];
        }
        System.out.println(Arrays.toString(array) + " resulted array");


    }

    void SortArray(int[] array){

    }
}
