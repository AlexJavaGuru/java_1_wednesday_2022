package student_jelena_boicova.lesson_6_homework;

public class ArrayService {

    boolean searchNumber(int[] array, int numberToSearch){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch){
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] array, int numberToSearch){
        int number = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == numberToSearch){
                number++;
        }
    }
        return number;
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber){
        for (int i = 0; i < array.length; i++){
            if (array[i] == numberToReplace){
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int numberToReplace, int newNumber){
        int replace = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == numberToReplace){
                array[i] = newNumber;
                replace++;
            }
        }
        return replace;
    }

   void revert(int[] array){
       int[] reversedArray = new int[array.length];
       for(int i = 0; i < array.length; i++){
           reversedArray[i] = array[array.length - i - 1];
       }
       for(int i = 0; i < array.length; i++) {
           array[i] = reversedArray[i];
        }
    }
}