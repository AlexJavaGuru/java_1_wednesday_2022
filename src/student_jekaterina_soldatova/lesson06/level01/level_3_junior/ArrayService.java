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
        int arrayLength = array.length-1;
        int[] newArray = array;
        System.out.println("method" + Arrays.toString(newArray));

        for (int i = 0; i < (arrayLength+1); i++) {
            System.out.println(i);

            array[i] = newArray[arrayLength-i];
           // System.out.println(newArray[i]);
            System.out.println(newArray[i] + " - " + i);

        }
        System.out.println(Arrays.toString(array));

        //array = newArray;
    }

    void SortArray(int[] array){

    }
}
