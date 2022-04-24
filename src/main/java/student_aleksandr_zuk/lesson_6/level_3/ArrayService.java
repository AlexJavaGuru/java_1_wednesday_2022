package student_aleksandr_zuk.lesson_6.level_3;

class ArrayService {

    boolean contains(int [] array, int numberToSearch){
        for (int i : array) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int [] array, int numberToSearch) {
        int result = 0;
        int i = 0;

        while (i < array.length){
            if (numberToSearch == array[i]) {
                result++;
            } i++;
            }
        return result;
        }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber){
        for (int i = 0; i < array.length; i++) {
            if (numberToReplace == array[i]){
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int numberToReplace, int newNumber){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (numberToReplace == array[i]){
                array[i] = newNumber;
                result++;
            }
        }
        return result;
    }

    void revert(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int number = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = number;
            }
        }
}
